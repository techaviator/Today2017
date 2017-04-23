package day6.bangaloreproperties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BangalorePropertiesIframe {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bangaloreproperties.com/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='seller.asp']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//input[@class='inputbox'][@name='title']")).sendKeys("Selenium");;
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector("input.inputbox")).sendKeys("qwerty");
	}

}
