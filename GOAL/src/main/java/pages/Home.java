package pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.Base;

public class Home extends  Base {
	
	@FindBy(xpath="//input[@class=\"search-keyword\"]")
	WebElement search;
	
	@FindBy(xpath="//button[contains(@class,\"search-button\")]")
	WebElement submit;
	
	

	public Home() throws IOException  {
		
		PageFactory.initElements(driver, this);
	}
public  void search(String a) {
	
	search.sendKeys(a);	
}

public void submit() {
	
	submit.click();
}
}
