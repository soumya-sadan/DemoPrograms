package LocatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class XpathAxesDemo {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		//System.out.println(driver.findElement(By.xpath("//input[@id='input-firstname']//preceding::label[@for='input-firstname']")).getText());
		//System.out.println(driver.findElement(By.xpath("//input[@id='input-lastname']/preceding::label[@for='input-lastname']")).getText());		
		
		/*
		getElement("input-lastname");
		getElement("input-lastname");
		getElement("input-email");
		getElement("input-telephone");
		getElement("input-password");
		getElement("input-confirm"); */
		
		//preceding sibling not allowed in CSS
		
		//usage of Relative locators
		Thread.sleep(3000);
		WebElement fname = driver.findElement(By.cssSelector("label.col-sm-2[for='input-firstname']"));
		//System.out.println(fname.getAttribute("placeholder"));
		driver.findElement(with(By.tagName("input")).toRightOf(fname)).sendKeys("soumya");
//						        --------------------
//		  				  -------------------------------------------
	}
	public static void getElement(String Id)
	{
		System.out.println(driver.findElement(By.xpath("//input[@id='" + Id + "']//preceding::label[@for='" + Id + "']")).getText());

	}

}