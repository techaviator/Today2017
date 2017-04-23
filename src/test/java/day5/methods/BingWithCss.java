package day5.methods;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BingWithCss {
	FirefoxDriver driver;
	public void handleBrowser(){
		//open the firefox
		driver = new FirefoxDriver();
		//launch the URL
		driver.get("http://bing.com");
		// maximize
		driver.manage().window().maximize();
	}
	
	public void searchKeyword(String searchWord) throws InterruptedException{
		//enter the search keyword
		driver.findElement(By.cssSelector("input#sb_form_q")).sendKeys(searchWord);
		//Click on the search icon
		driver.findElement(By.cssSelector("input.b_searchboxSubmit")).click();
		//Get the no. of hits
		String result = driver.findElement(By.cssSelector(".sb_count")).getText();
		//display the result to the user
		System.out.println("The no. of hits for sachin is "+result);				
		Thread.sleep(5000);
	}
	
	public void tearDown(){
		//close the browser
		driver.close();
	}
	
	
	
	
	public static void main(String[] args) throws InterruptedException {
	
		BingWithCss bing = new BingWithCss();
		bing.handleBrowser();
		bing.searchKeyword("ganguly");
		bing.tearDown();
		
	}

}
