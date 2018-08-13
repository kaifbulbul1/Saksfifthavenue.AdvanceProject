package dataprovider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	public static String [][] getExcelData(String xlPath, String xlSheet) throws IOException{
		
		File src = new File(xlPath);
		FileInputStream fis = new FileInputStream(src);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet ws = wb.getSheet(xlSheet);
		int xlRow = ws.getLastRowNum()+1;
		int xlCol = ws.getRow(0).getLastCellNum();
		String xlData[][] = new String [xlRow][xlCol];
		for(int i=0; i<xlRow;i++)
		{
			XSSFRow row = ws.getRow(i);
			String value = " ";
			for(int j=0;j<xlCol;j++)
			{
				XSSFCell cell = row.getCell(j);
				if(cell !=null)
				{
					value = cellToString(cell);
				}
				xlData[i][j] = value;
			}
		
		
	   }
		wb.close();
		return xlData;
	}
	
	public static String cellToString(XSSFCell cell)
	{
		int type = cell.getCellType();
		Object result = null;
		switch(type)
		{
			case XSSFCell.CELL_TYPE_BLANK:
				result = "%";
				break;
			case XSSFCell.CELL_TYPE_NUMERIC:
				result = cell.getNumericCellValue();
				break;
			case XSSFCell.CELL_TYPE_BOOLEAN:
				throw new RuntimeException("Can not handle boolean type");
			case XSSFCell.CELL_TYPE_ERROR:
				throw new RuntimeException("Can not handle error");
			case XSSFCell.CELL_TYPE_FORMULA:
				throw new RuntimeException("Can not handle formula");
			case XSSFCell.CELL_TYPE_STRING:
				result = cell.getStringCellValue();
				break;
			default:
					System.out.println("Can not support this type");
		}
	
		return result.toString();
	
	}
		
}
	

