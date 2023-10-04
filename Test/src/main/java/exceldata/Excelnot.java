package exceldata;

import java.io.FileInputStream;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelnot
{
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
public static String getStringData(int a,int b) throws IOException {
f=new FileInputStream("C:\\Users\\lenovo\\Documents.xlsx");
w=new XSSFWorkbook(f);
s=w.getSheet("Book1");
Row r=s.getRow(a);
Cell c=r.getCell(b);
return c.getStringCellValue();

}
public static String getIntegerData(int d,int e) throws IOException {
	f=new FileInputStream("C:\\Users\\lenovo\\Documents.xlsx");
	w=new XSSFWorkbook(f);
	s=w.getSheet("Book1");
	Row r=s.getRow(d);
	Cell c=r.getCell(e);
	int x=(int) c.getNumericCellValue();
	return String.valueOf(x);
}
}