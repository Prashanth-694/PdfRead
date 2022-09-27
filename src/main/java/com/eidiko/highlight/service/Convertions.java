package com.eidiko.highlight.service;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.docx4j.Docx4J;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.springframework.stereotype.Service;

@Service
public class Convertions {

	public void ConvertDocxToPDF(String docPath, String pdfPath) throws InvalidFormatException {

		try {
			InputStream templateInputStream = new FileInputStream(docPath);
			WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(templateInputStream);
			// MainDocumentPart documentPart = wordMLPackage.getMainDocumentPart();

			String outputfilepath = pdfPath;
			FileOutputStream os = new FileOutputStream(outputfilepath);
			Docx4J.toPDF(wordMLPackage, os);
			os.flush();
			os.close();
		} catch (Throwable e) {

			e.printStackTrace();
		}
	}

	/*
	 * public static void main(String[] args) throws InvalidFormatException {
	 * Convertions con = new Convertions(); con.ConvertDocxToPDF(null, null); }
	 */

}
