package day8.handlingObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	FirefoxDriver driver=null;
	public FirefoxDriver intializeBrowser(){
		//open the firefox
				driver = new FirefoxDriver();
				//launch the URL
				driver.get("http://bing.com");
				// maximize
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				return driver;
	}
	
	public void tearDown(){
		driver.quit();
	}

}
