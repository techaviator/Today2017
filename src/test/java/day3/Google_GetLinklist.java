package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Google_GetLinklist {
	
	public static void main(String[] args) {
		//FirefoxDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/src/test/resources/IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.navigate().to("http://google.com");
		
		driver.manage().window().maximize();
		
		List<WebElement> element = driver.findElements(By.tagName("a"));
		System.out.println(element.size());
		
	/*	for(int i =0;i<50;i++)
		{
			System.out.println(element.get(i).getText());
		}*/
		
		for(WebElement e:element)
		{
			System.out.println(e.getText());
		}
		
		driver.close();
		
		
	}

}
