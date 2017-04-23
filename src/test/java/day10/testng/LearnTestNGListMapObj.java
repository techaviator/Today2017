package day10.testng;

import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LearnTestNGListMapObj {
	@Test(dataProvider = "dp", dataProviderClass = day10.testng.DataproviderListObjectofMap.class)
	public void searchEngine(Map<String,String> map){
		//String expected = "10000";
		WebDriver driver = new FirefoxDriver();
		driver.get("http://bing.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys(map.get("SearchKey"));
		driver.findElement(By.xpath("//input[@id='sb_form_go']")).click();
		String actual = driver.findElement(By.xpath(".//div[@id='b_tween']/span[1]")).getText();
		System.out.println("The actual no. of hits :" +actual);
		System.out.println("The expected no. of hits :" +map.get("Expected"));
		driver.quit();
	}
}
