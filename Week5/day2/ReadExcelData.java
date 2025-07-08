package week5.day2;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelData {

	public static void main(String[] args) throws IOException {
		// Step1-> Set path for workbook
		XSSFWorkbook wb = new XSSFWorkbook("./data/CreateLead.xlsx");
		// step2-> Get into the sheet
//		Step3-> Get into Row values
//		Step4-> Get into cell values
//		Step5-> Read Data from workbook and print
//		System.out.println(wb.getSheet("formdata").getRow(0).getCell(1).getStringCellValue());
		int totalNumOfRows = wb.getSheet("formdata").getLastRowNum();
		short totalNumOfColumns = wb.getSheet("formdata").getRow(0).getLastCellNum();
		System.out.println("Total number of row present inside the sheet is : " + totalNumOfRows);// 3
		System.out.println("Total number of cell present inside the each row  is : " + totalNumOfColumns); // 4
		for (int i = 0; i <= totalNumOfRows; i++) {
			System.out.print("|");
			for (int j = 0; j < totalNumOfColumns; j++) {
				String data = wb.getSheet("formdata").getRow(i).getCell(j).getStringCellValue();
				System.out.print(data + "|");
				// Store the value within 2D array of String
			}
			System.out.println();
		}
		// Step6-> close the workbook
		wb.close();
	}
}
