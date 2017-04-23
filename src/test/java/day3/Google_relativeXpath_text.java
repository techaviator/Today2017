package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Google_relativeXpath_text {
	
	public static void main(String[] args) throws InterruptedException {
		
		FirefoxDriver driver = new FirefoxDriver();
		
		driver.get("http://google.com");
		driver.manage().window().maximize();
		
		//driver.findElement(By.xpath("//a[text()='Gmail']")).click();
		//driver.findElement(By.xpath("//a[.='Gmail']")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).click();
		driver.findElement(By.xpath("//a[contains(.,'Gmail')]")).click();
		Thread.sleep(5000);
		driver.close();
	}

}
