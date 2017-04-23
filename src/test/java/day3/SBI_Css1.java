package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SBI_Css1 {
	
	public static void main(String[] args) {
		//open the browser
		FirefoxDriver driver = new FirefoxDriver();
		//launch the url
		driver.get("https://www.sbi.co.in/portal/web/home/emi-calculator");
		// maximize browser
		driver.manage().window().maximize();
		//enter the loan amount
		driver.findElement(By.cssSelector("input[name='uamount'][class='textbox']")).sendKeys("100000");
		//enter the tneure
		driver.findElement(By.cssSelector("input[name^='uTi']")).sendKeys("60");
		//enter the interest
		driver.findElement(By.cssSelector("input[name$='ate']")).sendKeys("12");
		//click on the calculate buton
		driver.findElement(By.cssSelector("table[class='commontable']>tbody>tr:nth-child(3)>td>p>input")).click();
		//get emi
		String emi = driver.findElement(By.cssSelector("input[name*='Em']")).getAttribute("value");
		//display it to the usr
		System.out.println("The emi is"+emi);
		//close the browser
		driver.close();
	}

}
