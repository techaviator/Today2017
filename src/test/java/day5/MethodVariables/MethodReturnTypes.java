package day5.MethodVariables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MethodReturnTypes {
	
	public int display(){
		return 5;
	}
	
	public String display1(){
		return "test";
	}
	
	public boolean display2(){
		return true;
	}
	
	public FirefoxDriver display3(){
		return new FirefoxDriver();
	}
	
	public FirefoxDriver display4(FirefoxDriver driver){
		return driver;
	}
	
	public WebElement display5(FirefoxDriver driver){
		return driver.findElement(By.id("123"));
	}
	
	public String display6(WebElement e){
		return e.getText();
	}
	
	public By display7(){
		return By.id("123");
	}
	
	public List<WebElement> display8(FirefoxDriver driver){
		return driver.findElements(By.id("123"));
	}

}
