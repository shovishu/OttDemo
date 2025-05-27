package utils;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookFactory;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {
    public static String[][] getCellData(String sheetName) {

//        String[][] testData = new String[0][];
        String path = System.getProperty("user.dir") + "/src/test/testData/logindata.xlsx";

        String[][] testData = new String[0][];
        try {
            FileInputStream fis = new FileInputStream(path);
            Workbook workbook = new XSSFWorkbook(fis);
            Sheet sheet = workbook.getSheet(sheetName);

            int totalRows = sheet.getLastRowNum();
            System.out.println(totalRows + ": is total row count");
            Row rowCells = sheet.getRow(0);

            int totalColumns = rowCells.getLastCellNum();
            System.out.println(totalColumns + ": is total columns");

            DataFormatter formatter = new DataFormatter();

            testData = new String[totalRows][totalColumns];
            for (int i = 1; i < totalRows; i++) {
                for (int j = 0; j < totalColumns; j++) {
                    testData[i - 1][j] = formatter.formatCellValue(sheet.getRow(i).getCell(j));
                    System.out.println(testData[i - 1][j]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return testData;
    }

    public static void main(String[] args){
        getCellData("login");
    }
}
