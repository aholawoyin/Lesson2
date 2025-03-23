package com.techhub;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileOutputStream;
import  java.io.FileInputStream;
import java.io.IOException;

public class POITest {

    public static void main(String[] args) throws IOException {
        //GenerateExcelFile();

        //ReadExcelFile();

        GenerateXML();
    }

    public static  void GenerateExcelFile(){
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Student Scores");

        Row row1 = sheet.createRow(0);
        Row row2 = sheet.createRow(1);
        Row row3 = sheet.createRow(2);


        Cell row1Cell1 = row1.createCell(0);
        Cell row1Cell2 = row1.createCell(1);
        Cell row1Cell3 = row1.createCell(2);

        row1Cell1.setCellValue(45);
        row1Cell2.setCellValue(68);
        row1Cell3.setCellValue(79);

        Cell row2Cell1 = row2.createCell(0);
        Cell row2Cell2 = row2.createCell(1);
        Cell row2Cell3 = row2.createCell(2);

        row2Cell1.setCellValue(56);
        row2Cell2.setCellValue(88);
        row2Cell3.setCellValue(120);

        Cell row3Cell1 = row3.createCell(0);
        Cell row3Cell2 = row3.createCell(1);
        Cell row3Cell3 = row3.createCell(2);

        row3Cell1.setCellValue(56);
        row3Cell2.setCellValue(78);
        row3Cell3.setCellValue(45);

        try (FileOutputStream fos = new FileOutputStream("Scores.xlsx")) {
            workbook.write(fos);
            System.out.println("Excel file created!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void ReadExcelFile() throws IOException{
        String filename ="Scores.xlsx";
        FileInputStream inputStream = new FileInputStream(filename);

        Workbook workbook= WorkbookFactory.create(inputStream);

        for (Sheet sheet : workbook){
            System.out.println("Sheet Name = "+sheet.getSheetName());
            for (Row row : sheet){
                for (Cell cell: row){
                    System.out.print(cell.toString()+", ");
                }
                System.out.println();
            }

        }

    }

    public static void GenerateXML() throws IOException{
        String filename ="Scores.xlsx";
        FileInputStream inputStream = new FileInputStream(filename);

        Workbook workbook= WorkbookFactory.create(inputStream);

        System.out.println("<?xml version=\"1.0\" encoding=\"UTF-8\" ?>");

        System.out.println("<Sheets>");

        for (Sheet sheet : workbook){
            System.out.println("<Sheet name=\""+sheet.getSheetName()+"\"");

            for (Row row : sheet){
                System.out.println("<Row>");
                for (Cell cell: row){
                    System.out.println("<Cell>" + cell.toString());
                    System.out.println("</Cell>");
                }
                System.out.println("</Row>");
            }

            System.out.println("</Sheet>");

        }

        System.out.println("</Sheets>");
    }
}
