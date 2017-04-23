package day8.handlingObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BingWebElement {
	FirefoxDriver driver = null;
	
	public BingWebElement(FirefoxDriver browser) {		
		driver = browser;
	}
	public WebElement getSearchWordWebElement(){
		return driver.findElement(By.cssSelector("input#sb_form_q"));
	}
	public WebElement getSearchIconWebElement(){
		return driver.findElement(By.cssSelector("input.b_searchboxSubmit"));
		}
	public WebElement getResultWebElement(){
		 return driver.findElement(By.cssSelector(".sb_count"));
	}

}
