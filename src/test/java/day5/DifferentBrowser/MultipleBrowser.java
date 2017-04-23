package day5.DifferentBrowser;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultipleBrowser {
	public static void main(String[] args) {
		//FirefoxDriver driver = new FirefoxDriver();
		//System.setProperty("webdriver.chrome.driver", "D:\\Jim\\workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
		/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/src/test/resources/IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
		driver.get("http://in.rediff.com/");
		//driver.close();
		driver.quit();
		
		
		
	}

}
