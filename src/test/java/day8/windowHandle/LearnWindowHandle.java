package day8.windowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LearnWindowHandle {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://in.rediff.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		Set<String> windowHandles = driver.getWindowHandles();
		String mainWindow = driver.getWindowHandle();
		
		for(String windowId: windowHandles){
			if(!windowId.equals(mainWindow)){
				driver.switchTo().window(windowId);
				String title = driver.getTitle();
				System.out.println(title);
				break;
			}
			
		}
		Thread.sleep(5000);
		driver.close();
		driver.switchTo().window(mainWindow);
		Thread.sleep(5000);
		driver.quit();
	}

}
