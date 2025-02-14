package Practice;

	import java.io.FileInputStream;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DataFormatter;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;

	//import genericUtility.ExcelUtility;

	public class FetchingDataFromExcel {
	   public static void main(String[] args) throws Exception {
		   /*FileInputStream fis=new FileInputStream("H:\\modules.xlsx");
			Workbook wb= WorkbookFactory.create(fis);
			Sheet sheet = wb.getSheet("animal");
			Row row = sheet.getRow(1);
			Cell cell=row.getCell(1);
			String value=cell.getStringCellValue();
			System.out.println(value);
			*/
//		  ExcelUtility eUtil = new ExcelUtility();
//		  String value = eUtil.getDataFromExcel("Leads", 2, 2);
//		  System.out.println(value);
		   /**
		    * 
		    */
		    FileInputStream fis = new FileInputStream(".\\src\\test\\resources\\test data\\modules.xlsx");
		    Workbook wb= WorkbookFactory.create(fis);
			Sheet sh = wb.getSheet("Animal");
			System.out.println(sh.getLastRowNum());
			DataFormatter df = new DataFormatter();
			for(int i = 1; i<sh.getLastRowNum(); i++)
			{
				Row row = sh.getRow(i);
				System.out.println(row.getLastCellNum());
				for(int j = 0; j<row.getLastCellNum(); j++)
				{
					Cell cell = row.getCell(j);
					String value1 = df.formatCellValue(cell);
					System.out.println(value1);
				}
				
			}
	   }	
	}



