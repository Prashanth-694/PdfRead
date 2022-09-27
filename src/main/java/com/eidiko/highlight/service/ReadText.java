package com.eidiko.highlight.service;

import org.springframework.stereotype.Service;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

@Service
public class ReadText {

	public String readText(String pdfPath)
	{
		String str="";
		try {     
		    PdfReader reader = new PdfReader(pdfPath);
		    int n = reader.getNumberOfPages(); 
		    str=PdfTextExtractor.getTextFromPage(reader, 0); //Extracting the content from a particular page.
		    System.out.println(str);
		    reader.close();
		} catch (Exception e) {
		    System.out.println(e);
		}
		return str;
	}
}
