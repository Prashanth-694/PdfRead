package com.eidiko.highlight.controller;

import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eidiko.highlight.service.Convertions;
import com.eidiko.highlight.service.ReadHighlightedTextFromDocx;
import com.eidiko.highlight.service.ReadHighlightedTextFromPdf;

@RestController
public class HighlightWordController {

	@Autowired
	private ReadHighlightedTextFromPdf fromPdf;

	@Autowired
	private ReadHighlightedTextFromDocx fromDocx;

	@Autowired
	private Convertions convertions;

	@GetMapping("/")
	public void getHighlightedWord() {
		System.out.println("inside get method");
	}

	@GetMapping("/textFromPdf")
	public ArrayList<String> getHighlightedText(@RequestParam String pdfPath) throws IOException {

		return fromPdf.getHighlightedTextFromPdf(pdfPath);
	}

	/*
	 * @GetMapping("/Docs") public ArrayList<String> getHighlightedTextFromDocx()
	 * throws IOException {
	 * 
	 * return highlightedTexts; }
	 */

	@GetMapping("/readAllText")
	public void read(@RequestParam String pdfPath) throws IOException {
		fromPdf.read(pdfPath);
	}

	@GetMapping("/docxToPdf")
	public void convert(@RequestParam String docPath, @RequestParam String pdfPath) throws InvalidFormatException {
		convertions.ConvertDocxToPDF(docPath, pdfPath);
	}
}