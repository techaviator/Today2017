package day10.testng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.Test;

public class LearnTestng3 {
	
	@Test(dataProvider = "dp", dataProviderClass = day10.testng.LearnDataProvider.class)
	public void searchEngine(String searchKey, String expected){
		//String expected = "10000";
		WebDriver driver = new FirefoxDriver();
		driver.get("http://bing.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id='sb_form_q']")).sendKeys(searchKey);
		driver.findElement(By.xpath("//input[@id='sb_form_go']")).click();
		String actual = driver.findElement(By.xpath(".//div[@id='b_tween']/span[1]")).getText();
		System.out.println("The actual no. of hits :" +actual);
		System.out.println("The expected no. of hits :" +expected);
		driver.quit();
	}
	
	/*@DataProvider(name="dp")
	public  Object[][] setData(){
		Object[][] obj = new Object[2][2];
		obj[0][0] = "Sachin";
		obj[0][1] = "10000";
		obj[1][0] = "Sachin Tendulkar";
		obj[1][1] = "20000";
		return obj;*/

}
