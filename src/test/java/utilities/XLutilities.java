package utilities;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLutilities {

	  private static XSSFWorkbook loadWorkbook(String xlfile) throws IOException {
	        FileInputStream fi = new FileInputStream(xlfile);
	        XSSFWorkbook workbook = new XSSFWorkbook(fi);
	        fi.close();
	        return workbook;
	    }

	    private static void saveWorkbook(String xlfile, XSSFWorkbook workbook) throws IOException {
	        FileOutputStream fo = new FileOutputStream(xlfile);
	        workbook.write(fo);
	        fo.close();
	    }

	    public static int getRowCount(String xlfile, String xlsheet) throws IOException {
	        try (XSSFWorkbook wb = loadWorkbook(xlfile)) {
	            XSSFSheet ws = wb.getSheet(xlsheet);
	            return ws.getLastRowNum();
	        }
	    }

	    public static int getCellCount(String xlfile, String xlsheet, int rownum) throws IOException {
	        try (XSSFWorkbook wb = loadWorkbook(xlfile)) {
	            XSSFSheet ws = wb.getSheet(xlsheet);
	            XSSFRow row = ws.getRow(rownum);
	            return row == null ? 0 : row.getLastCellNum();
	        }
	    }

	    public static String getCellData(String xlfile, String xlsheet, int rownum, int colnum) throws IOException {
	        try (XSSFWorkbook wb = loadWorkbook(xlfile)) {
	            XSSFSheet ws = wb.getSheet(xlsheet);
	            XSSFRow row = ws.getRow(rownum);
	            XSSFCell cell = row == null ? null : row.getCell(colnum);
	            return new DataFormatter().formatCellValue(cell);
	        }
	    }

	    public static void setCellData(String xlfile, String xlsheet, int rownum, int colnum, String data) throws IOException {
	        try (XSSFWorkbook wb = loadWorkbook(xlfile)) {
	            XSSFSheet ws = wb.getSheet(xlsheet);
	            XSSFRow row = ws.getRow(rownum);
	            if (row == null) row = ws.createRow(rownum);
	            XSSFCell cell = row.createCell(colnum);
	            cell.setCellValue(data);
	            saveWorkbook(xlfile, wb);
	        }
	    }

}
