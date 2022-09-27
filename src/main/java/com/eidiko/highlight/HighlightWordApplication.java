package com.eidiko.highlight;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HighlightWordApplication {

	public static void main(String[] args) {
		SpringApplication.run(HighlightWordApplication.class, args);
		
	/*	System.out.println("inside main");
		
		 //Create a Document instance

		  Document document = new Document();



		  //Load a sample Word document

		  document.loadFromFile("E:\\Files\\input1.docx");



		  //Find all matching text in the document

	  TextSelection[] textSelections = document.findAllString("transcendentalism", false, true);

		//  TextSelection[] textSelections = document.

		  //Loop through all matching text and set highlight color for them

		  for (TextSelection selection : textSelections) {

//		      selection.getAsOneRange().getCharacterFormat().setHighlightColor(Color.YELLOW);
			  selection.getAsOneRange().getCharacterFormat().get
		  }



		  //Save the document

		   document.saveToFile("FindAndHighlight.docx", FileFormat.Docx_2013);
*/
	}

}
