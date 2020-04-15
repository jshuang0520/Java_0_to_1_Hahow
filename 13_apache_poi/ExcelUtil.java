import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil{

    public static void readFile(String fileName) throws IOException{
    	/**
    	1. FileInputStream(File pathOfFile) - to read a file
		2. XSSFWorkbook                     - to new an excel object 
		3. XSSFSheet
		    (1) rowIterator
		4. Iterator
		    (1) Iterator.hasNext()
		    (2) Iterator.next()             - .next() returns value of an element; Casting to keep using object "row"/"cell"
		5. XSSFRow
		6. XSSFCell
    	*/
    	// 1. FileInputStream(File pathOfFile) - to read a file
    	FileInputStream fis = new FileInputStream(new File(fileName));
    	// 2. XSSFWorkbook - to new an excel object
    	XSSFWorkbook wb = new XSSFWorkbook(fis);
    	// 3. try to read the first sheet
    	XSSFSheet sheet = wb.getSheetAt(0);
    	
    	// 4. Iterator - for rows
    	Iterator itRow = sheet.rowIterator();
    	// 4-(1) Iterator.hasNext()
    	while(itRow.hasNext()) {
    		// 4-(2) Iterator.next()
    		XSSFRow row = (XSSFRow)itRow.next(); // .next() returns value of an element; Casting to keep using object "row"
    		// 4. Iterator - for cells
    		Iterator itCell = row.cellIterator();
    		//  4-(1) Iterator.hasNext()
    		while(itCell.hasNext()) {
    			// 4-(2) Iterator.next()
    			XSSFCell cell = (XSSFCell)itCell.next(); // .next() returns value of an element; Casting to keep using object "cell"
    		    
    			// some operations...
    			System.out.print(cell + "," + "\t");
    		}
    		// prettify printing - jump to next line
    		System.out.println("");
    	}
    	
    	
	}
    
    
    public static void writeFile(String fileName, List<String[]> dataList) throws IOException {
    	// 1. XSSFWorkbook - to new an object of excel workbook
    	XSSFWorkbook wb = new XSSFWorkbook();
    	// 2. wb.createSheet() - to create an object of sheet
    	XSSFSheet sheet = wb.createSheet("EnterSheetNameHere"); // NOT new XSSFSheet(wb);
    	// 3. prepare for "column row" and it's values : 
    	// (3-1) row = sheet.createRow()
    	XSSFRow titleRow = sheet.createRow(0);
    	// (3-2) cell = row.createCell()
    	XSSFCell cell1 = titleRow.createCell(0);
    	XSSFCell cell2 = titleRow.createCell(1);
    	XSSFCell cell3 = titleRow.createCell(2);
    	// (3-3) cell.setCellValue()
    	cell1.setCellValue("id");
    	cell2.setCellValue("name");
    	cell3.setCellValue("title");
    	
    	// 4. Iterate for rows & cells
    	// Iterate for rows
    	for(int i=0; i<dataList.size(); i++) {
    		// (4-1) row = sheet.createRow()
    		XSSFRow row = sheet.createRow(i+1); // row 0 contains "column names", so starts with row (i+1)=(0+1)=1
    		// get values which to be written into cells
    		String[] rowData = dataList.get(i); // there are 3 rows(Jake, Felix, Johnson) for our new data, so starts with row 1
    		// Iterate for cells
    		for(int j=0; j<rowData.length; j++) {
    			// (4-2) cell = row.createCell()
    			XSSFCell cell = row.createCell(j);
    			// (4-3) cell.setCellValue()
    			cell.setCellValue(rowData[j]);
    		}
    	}
    	// 5. FileOutputStream
    	FileOutputStream fos = new FileOutputStream(fileName);
    	// 6. wb.write()
    	wb.write(fos);
    	// 7. close resource
    	fos.flush();
    	fos.close();
    }
}
