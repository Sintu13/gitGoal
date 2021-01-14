package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import base.Base;

public class utill extends Base{

public utill() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	//	public utill() throws IOException {
//		super();
//		// TODO Auto-generated constructor stub
//	}
	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLICIT_WAIT = 10;
	public void  test() {
		
		System.out.println("vk");
	}
	public String data (String sheet, int row ,int col ) throws IOException  {
		System.out.println("1test");
	
	FileInputStream fis = new FileInputStream("F://java0604//GOAL//src//main//java//testData//test.xlsx");
	
	XSSFWorkbook wb = new XSSFWorkbook(fis);	
	
	XSSFSheet st=wb.getSheet(sheet);
	
	String k=st.getRow(row).getCell(col).toString(); 
		return k;
	}
	
	
	
}
