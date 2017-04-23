package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sbibank {
	public static void main(String[] args) {
		//open the browser
		FirefoxDriver driver = new FirefoxDriver();
		//launch the url
		driver.get("https://www.sbi.co.in/portal/web/home/emi-calculator");
		// maximize browser
		driver.manage().window().maximize();
		//enter the loan amount
		driver.findElement(By.name("uamount")).sendKeys("100000");
		//enter the tneure
		driver.findElement(By.name("uTime")).sendKeys("60");
		//enter the interest
		driver.findElement(By.name("uRate")).sendKeys("12");
		//click on the calculate buton
		driver.findElement(By.xpath("//table[@class='commontable']/tbody/tr[3]/td[1]/p[1]/input[1]")).click();
		//get emi
		String emi = driver.findElement(By.name("uEmi")).getAttribute("value");
		//display it to the usr
		System.out.println("The emi is"+emi);
		//close the browser
		driver.close();
	}
}
