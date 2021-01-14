package test;

import java.io.IOException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.Home;
import util.utill;

public class test extends  Base {
	Home a;
	utill u;

	public test() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	@BeforeMethod
	public void setup() throws IOException  {
		initilization();
	a=new Home ();
		
	}
	
	@Test(priority=1)
	public void search() throws IOException{
		u =new utill();
		System.out.println("test0.0");
		u.test();
	String value=u.data("ww",0,0);
	System.out.println("test1");
		
		a.search(value);
		a.submit();
		
	}

	
	
}
