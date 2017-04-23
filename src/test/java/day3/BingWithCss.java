package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BingWithCss {
	
	public static void main(String[] args) throws InterruptedException {
		//open the firefox
		FirefoxDriver driver = new FirefoxDriver();
		//launch the URL
		driver.get("http://bing.com");
		// maximize
		driver.manage().window().maximize();
		//enter the search keyword
		driver.findElement(By.cssSelector("input#sb_form_q")).sendKeys("sachin");
		//Click on the search icon
		driver.findElement(By.cssSelector("input.b_searchboxSubmit")).click();
		//Get the no. of hits
		String result = driver.findElement(By.cssSelector(".sb_count")).getText();
		//display the result to the user
		System.out.println("The no. of hits for sachin is "+result);
		
		Thread.sleep(5000);
		//close the browser
		driver.close();
	}

}
