package day6.multipleBrowser;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MultipleBrowser {
	public static void main(String[] args) throws InterruptedException {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println(" Choose the browser");
		String browsertype = scan.nextLine();
		scan.close();
		WebDriver driver =null;
		
		if(browsertype.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
			 driver = new ChromeDriver();
		}else if(browsertype.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/src/test/resources/IEDriverServer.exe");
			 driver = new InternetExplorerDriver();
		}else if(browsertype.equalsIgnoreCase("firefox")){
			 driver = new FirefoxDriver();
		}else{
			System.out.println("The browser entered is incorrect");
		}
		//FirefoxDriver driver = new FirefoxDriver();
				//System.setProperty("webdriver.chrome.driver", "D:\\Jim\\workspace\\Selenium\\src\\test\\resources\\chromedriver.exe");
				/*System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/test/resources/chromedriver.exe");
				ChromeDriver driver = new ChromeDriver();*/
				/*System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"/src/test/resources/IEDriverServer.exe");
				InternetExplorerDriver driver = new InternetExplorerDriver();*/
				driver.manage().window().maximize();
				driver.get("http://in.rediff.com/");
				Thread.sleep(5000);
				//driver.close();
				driver.quit();
	}

}
