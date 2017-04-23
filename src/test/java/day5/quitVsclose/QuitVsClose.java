package day5.quitVsclose;

import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitVsClose {
	public static void main(String[] args) {
		FirefoxDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://in.rediff.com/");
		//driver.close();
		driver.quit();
	}

}
