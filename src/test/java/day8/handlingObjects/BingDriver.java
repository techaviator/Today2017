package day8.handlingObjects;

import org.openqa.selenium.firefox.FirefoxDriver;

public class BingDriver {
	
	public static void main(String[] args) throws InterruptedException {
		Browser browser= new Browser();
		FirefoxDriver driver = browser.intializeBrowser();
		BingWebElement bingWebElement = new BingWebElement(driver);		
		Events events = new Events();
		
		//enter the search keyword
		events.sendKeys(bingWebElement.getSearchWordWebElement(), "Sachin");
		//Click on the search icon
		events.click(bingWebElement.getSearchIconWebElement());
		//Get the no. of hits
		String result = events.getText(bingWebElement.getResultWebElement());
		//display the result to the user
		System.out.println("The no. of hits for sachin is "+result);
		
		Thread.sleep(5000);
		browser.tearDown();
		
	}

}
