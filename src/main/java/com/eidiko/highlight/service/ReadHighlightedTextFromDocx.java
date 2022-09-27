package com.eidiko.highlight.service;

import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.pdfbox.cos.COSArray;
import org.apache.pdfbox.cos.COSFloat;
import org.apache.pdfbox.cos.COSName;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.spire.doc.Document;

@Service
public class ReadHighlightedTextFromDocx {
	@GetMapping("/Doc")
	@SuppressWarnings({ "unchecked", "unused" })
	public ArrayList<String> getHighlightedTextFromDocx() throws IOException {

		/*
		 * int pageNumber=0; ArrayList<String> highlightedTexts = new ArrayList<>();
		 * 
		 * File file=new File("C:\\local\\spp.pdf");
		 * 
		 * //Create a Document instance
		 * 
		 * Document document = new Document();
		 * 
		 * 
		 * 
		 * //Load a sample Word document
		 * 
		 * // document.loadFromFile("E:\\Files\\input1.docx");
		 * 
		 * //document.getA List<PDPage> allPages=
		 * document.getDocumentCatalog().getAllPages();
		 * 
		 * 
		 * 
		 * PDPage page = allPages.get(pageNumber);
		 * 
		 * List<PDAnnotation> annotations = page.getAnnotations();
		 * 
		 * System.out.println("annotations.size() : "+annotations.size()+" and :"
		 * +annotations.toString());
		 * 
		 * for(int i=0; i<annotations.size(); i++) { // check subType
		 * System.out.println(annotations.get(i).getSubtype());
		 * if(annotations.get(i).getSubtype().equals("Highlight")) { // extract
		 * highlighted text org.apache.pdfbox.util.PDFTextStripperByArea stripperByArea
		 * = new org.apache.pdfbox.util.PDFTextStripperByArea();
		 * 
		 * COSArray quadsArray = (COSArray)
		 * annotations.get(i).getDictionary().getDictionaryObject(COSName.getPDFName(
		 * "QuadPoints")); String str = null;
		 * System.out.println("quadsArray.size()"+quadsArray.size()); for(int j=1, k=0;
		 * j<=(quadsArray.size()/8); j++) {
		 * 
		 * COSFloat ULX = (COSFloat) quadsArray.get(0+k); COSFloat ULY = (COSFloat)
		 * quadsArray.get(1+k); COSFloat URX = (COSFloat) quadsArray.get(2+k); COSFloat
		 * URY = (COSFloat) quadsArray.get(3+k); COSFloat LLX = (COSFloat)
		 * quadsArray.get(4+k); COSFloat LLY = (COSFloat) quadsArray.get(5+k); COSFloat
		 * LRX = (COSFloat) quadsArray.get(6+k); COSFloat LRY = (COSFloat)
		 * quadsArray.get(7+k);
		 * 
		 * k+=8;
		 * 
		 * float ulx = ULX.floatValue() - 1; // upper left x. float uly =
		 * ULY.floatValue(); // upper left y. float width = URX.floatValue() -
		 * LLX.floatValue(); // calculated by upperRightX - lowerLeftX. float height =
		 * URY.floatValue() - LLY.floatValue(); // calculated by upperRightY -
		 * lowerLeftY.
		 * 
		 * PDRectangle pageSize = page.getMediaBox(); uly = pageSize.getHeight() - uly;
		 * 
		 * 
		 * Rectangle2D.Float rectangle_2 = new Rectangle2D.Float(ulx, uly, width,
		 * height); stripperByArea.addRegion("highlightedRegion", rectangle_2);
		 * stripperByArea.extractRegions(page); String highlightedText =
		 * stripperByArea.getTextForRegion("highlightedRegion"); System.out.println(j);
		 * if(j > 1) { str = str.concat(highlightedText); } else { str =
		 * highlightedText; } } System.out.println("String"+str);
		 * highlightedTexts.add(str); } } document.close();
		 * 
		 * return highlightedTexts;
		 */
		return null;
	}

}
