import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**


---------------------------------------------------
-------------------------
Apache POI - the Java API for Microsoft Documents
-------------------------
Home     - https://poi.apache.org/
Download - https://poi.apache.org/download.html
JavaDocs - https://poi.apache.org/apidocs/index.html

---
(We now use MacOS, Eclipse as example)
---
To use SDK from the third party, you need to: 

1. Download a "jar" file
    (1) Download - https://poi.apache.org/download.html
    (2) Choose "the latest stable release is Apache POI ___"
    (3) Find "Binary Distribution" -> "poi-bin-...-.tar.gz"
2. Import it to your IDE (ex. Eclipse)
    (1) Drag the "jar" file to your "lib" folder in your "current project folder"
    (2) Project -> Properties
    (3) Java Build Path -> Libraries -> Add JARs
    (DO NOT click "add jars" for your .java files)

3. Read its API document to use its methods


---
Excel
---

Excel File : XSSFWorkbook
Sheet      : XSSFSheet
Row        : XSSFRow
Cell       : XSSFCell


---
Iterator (An Interface, something similar to forEach)
---

1. 走訪集合中的所有元素
    (1) hasNext() 回傳 boolean (usually put it in a while loop)
    (2) next()    回傳 element value (usually with Type Casting 強制轉型 )


---
Excel - Read
---

1. FileInputStream(File pathOfFile) - to read a file
2. XSSFWorkbook                     - to new an excel object 
3. XSSFSheet
    (1) rowIterator
4. Iterator
    (1) Iterator.hasNext()
    (2) Iterator.next()             - .next() returns value of an element; Casting to keep using object "row"/"cell"
5. XSSFRow
6. XSSFCell


new FileInputStream(fileName);
new XSSFWorkbook(fis);

XSSFWorkbook.getSheetAt(0); // 1st sheet
XSSFSheet.rowIterator();
XSSFRow.cellIterator();



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
		System.out.println(cell + " ");
	}
	// prettify printing - jump to next line
	System.out.println("");
}


---
Excel - Write
---

XSSFWorkbook.createSheet
XSSFSheet.createRow
XSSFRow.createCell
XSSFCell.setCellValue
FileOutputStream
XSSFWorkbook.write


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


---------------------------------------------------

*/