package day8.windowHandle;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandleAlert {
	public static void main(String[] args) throws InterruptedException {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://in.rediff.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
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
		driver.close();
		driver.switchTo().window(mainWindow);
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		//alert.accept();
		alert.dismiss();
		Thread.sleep(2000);
		driver.quit();
	}

}
