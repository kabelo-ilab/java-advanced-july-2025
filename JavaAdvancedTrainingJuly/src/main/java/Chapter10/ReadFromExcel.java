package Chapter10;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFromExcel {
    public static void main(String[] args) {
        String filePath = "src/main/resources/Modules.xlsx";

        try{
            FileInputStream input = new FileInputStream(filePath);
            //access the workbook
            XSSFWorkbook myWorkbook = new XSSFWorkbook(input);
            //access the spreadsheet
            XSSFSheet modulesSheet = myWorkbook.getSheet("Modules");
            /*create a nested loop to read cells with different
            cell types
             */
            for (int i = 0; i <= modulesSheet.getLastRowNum(); i++) {
                //create a row for each iteration
                Row myRow = modulesSheet.getRow(i);

                for (int j = 0; j < myRow.getLastCellNum(); j++) {
                    //create a cell in each row
                    Cell myCell = myRow.getCell(j);
                    System.out.print(myCell + "\t\t");
                }
                System.out.println();
            }
//            for (Row myRow : modulesSheet){
//                for(Cell myCell : myRow){
//                    System.out.print(myCell + "\t\t");
//                }
//                System.out.println();
//            }


            input.close();
            myWorkbook.close();
        }catch (FileNotFoundException ex){
            System.err.println(ex.getMessage());
        }catch (IOException ex){
            System.err.println(ex.getMessage());
        }

    }
}
