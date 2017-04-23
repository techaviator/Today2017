package day8.handlingObjects;

import org.openqa.selenium.WebElement;

public class Events {
	
	public void sendKeys(WebElement element, String searchKeyword){
		element.sendKeys(searchKeyword);
	}
	
	public void click(WebElement element){
		element.click();
	}
	
	public String getText(WebElement element){
		return element.getText();
	}

}
