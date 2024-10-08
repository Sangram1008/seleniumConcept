package readingExcel;

import org.apache.poi.xssf.usermodel.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class readingDataFromExcel {

    // Excel File ----> WorkBook ----> Sheets -----> Rows -----> Cells

    public static void main(String[] args) throws IOException {

        // Excel File Reading the File
        FileInputStream file = new FileInputStream("src/test/java/ExcelFile/data.xlsx");

        // Getting WorkBook
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        // Accessing the WorkBook

        //1)
        XSSFSheet sheet = workbook.getSheet("data");

        //2)
        XSSFSheet sheet1 = workbook.getSheetAt(0);

        // Rows
        int totalRows = sheet.getLastRowNum();
        int totalCell = sheet.getRow(1).getLastCellNum();

        System.out.println("Number of Rows " + totalRows);
        System.out.println("Number of Cell " + totalCell);

        for (int r = 0; r <= totalRows; r++) {  // Change to r <= totalRows
            XSSFRow currentRow = sheet.getRow(r);
            for (int c = 0; c < totalCell; c++) {  // Change to c < totalCell
                XSSFCell cell = currentRow.getCell(c);
                System.out.print(cell.toString() + "\t");
            }
            System.out.println();
        }
        workbook.close();
        file.close();
    }
}
