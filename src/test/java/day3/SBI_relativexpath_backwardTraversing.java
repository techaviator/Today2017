package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SBI_relativexpath_backwardTraversing {
	
	public static void main(String[] args) throws InterruptedException {
		//open the browser
		FirefoxDriver driver = new FirefoxDriver();
		//launch the url
		driver.get("https://www.sbi.co.in/portal/web/home/emi-calculator");
		// maximize browser
		driver.manage().window().maximize();
		//enter the loan amount
		//backward traverse
		driver.findElement(By.xpath("//input[@class='textbox'][@name='uTime']/../../p[1]/input[1]")).sendKeys("100000");
		//enter the tneure
		driver.findElement(By.xpath("//input[@class='textbox'][@name='uTime']")).sendKeys("60");
		//enter the interest
		driver.findElement(By.xpath("//input[@class='textbox'][@name='uRate']")).sendKeys("12");
		//click on the calculate buton
		driver.findElement(By.xpath("//table[@class='commontable']/tbody/tr[3]/td[1]/p[1]/input[1]")).click();
		//get emi
		String emi = driver.findElement(By.xpath("//input[contains(@name,'Em')]")).getAttribute("value");
		//display it to the usr
		System.out.println("The emi is"+emi);
		Thread.sleep(5000);
		//close the browser
		driver.close();
	}

}
