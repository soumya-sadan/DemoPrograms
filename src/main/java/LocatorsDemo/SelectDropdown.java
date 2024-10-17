package LocatorsDemo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SelectDropdown {
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		
		By countryElement =By.id("Form_getForm_Country");
		
		selectFromDropdown(countryElement, "Brazil");
		

	}
	
	public static void selectFromDropdown(By locator, String visibleText)
	{
		Select select = new Select(getElement(locator));
		select.selectByVisibleText(visibleText);
	}

	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
}

