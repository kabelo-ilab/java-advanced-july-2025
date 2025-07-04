package Chapter10;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteToExcel {
    public static void main(String[] args) {
        String filePath = "src/main/resources/Modules.xlsx";

        try{
            OutputStream output = new FileOutputStream(filePath);
            //create a workbook object
            XSSFWorkbook myWorkbook = new XSSFWorkbook();
            //create a spreadsheet
            XSSFSheet sheet = myWorkbook.createSheet("Modules");
            XSSFSheet sheetFruit = myWorkbook.createSheet("Fruit");
            //create a header row
            XSSFRow rowHeader = sheet.createRow(0);
            rowHeader.createCell(0).setCellValue("Module");
            rowHeader.createCell(1).setCellValue("Credits");
            //create row1
            XSSFRow row1 = sheet.createRow(1);
            row1.createCell(0).setCellValue("Java");
            row1.createCell(1).setCellValue(120);
            //create row2
            XSSFRow row2 = sheet.createRow(2);
            row2.createCell(0).setCellValue("SQL");
            row2.createCell(1).setCellValue(100);
            //Write on the second spreadsheet
            XSSFRow fruitRow1 = sheetFruit.createRow(0);
            fruitRow1.createCell(0).setCellValue("Apple");
            fruitRow1.createCell(1).setCellValue("Mango");
            fruitRow1.createCell(2).setCellValue("Banana");

            myWorkbook.write(output);//write to excel workbook
            output.close();
            myWorkbook.close();

        }catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }

    }
}
