package day6.bangaloreproperties;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BangalorePropertiesDropdown {
	
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.bangaloreproperties.com/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@src='seller.asp']"));
		driver.switchTo().frame(frame);
		WebElement dropdown = driver.findElement(By.name("area"));
		Select select = new Select(dropdown);
		
		List<WebElement> options = select.getOptions();
		System.out.println("THe number of locations in the dropdown is "+options.size());
		
		/*for(WebElement e:options)
		{
			//System.out.println(e.getText());// getting the value using gettext
			System.out.println(e.getAttribute("value"));
		}*/
		
		for(WebElement e: options){
			if(e.getText().equalsIgnoreCase("Wilson garden")){
				e.click();
				System.out.println(e.isSelected());
			}
		}
		
		//select.selectByIndex(1);
		//select.selectByValue("Wilson Garden");
		//select.selectByVisibleText("Wilson Garden");
		
	
	}

}
