package day6.buynow;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BuyProduct {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://in.lemall.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//implicit wait
		
		Actions actions = new Actions(driver);
		
		WebElement audio = driver.findElement(By.xpath("//li[@id='allAudioTab']/a"));
		actions.moveToElement(audio).perform();
		
		//Explict wait
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//p[text()='Letv All-Metal Earphones']"))));
		driver.findElement(By.xpath("//p[text()='Letv All-Metal Earphones']")).click();
		//wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='BUY NOW']"))));
		List<WebElement> buyNow = driver.findElements(By.xpath("//a[text()='BUY NOW']"));
		for(WebElement e:buyNow){
			System.out.println(e.isDisplayed());
			if((e.isDisplayed())==true){
				e.click();
			}
		}
	}

}
