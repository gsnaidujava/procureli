package com.procure2pay;

import java.io.IOException;

import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class PdfReaderExample {
	
	private static final String FILE_FORMAT_ONE = "./SamplePDFFiles/INV091811020680.pdf";
	
	private static final String FILE_FORMAT_TWO = "./SamplePDFFiles/Invoice.pdf";
	
	private static final String FILE_FORMAT_THREE = "./SamplePDFFiles/sk organic - 22.pdf";
	
	private static final String FILE_FORMAT_FOUR = "./SamplePDFFiles/TDRInvoice_PM993229_4875646_20181204162824.pdf";

    public static void main(String[] args) {
        PdfReader reader;
        try {
            reader = new PdfReader(FILE_FORMAT_ONE);

            // pageNumber = 1
            String textFromPage = PdfTextExtractor.getTextFromPage(reader, 1);
            
            System.out.println(textFromPage);

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}