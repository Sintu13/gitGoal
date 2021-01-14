package base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



import util.utill;

public class Base {
	
	protected static WebDriver driver;
	static Properties prop;
	public Base() throws IOException  {
		
prop= new Properties();
FileInputStream fs = null;

	fs = new FileInputStream("F:/java0604/GOAL/src/main/java/config/config.properties");


	prop.load(fs);

}


	public static void  initilization() {
		
		String url=prop.getProperty("URL");
		System.setProperty("webdriver.chrome.driver","S:\\chromedriver.exe");
		
		driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(utill.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(utill.IMPLICIT_WAIT,TimeUnit.SECONDS);
		driver.get(url);   
		
	}
	
	
	
	
	
	

}
