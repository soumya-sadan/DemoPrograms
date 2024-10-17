package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementClick {
	public static WebDriver driver;

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		//By txtFname = By.id("input-firstname");
	//	By txtLname = By.xpath("//input[@name='lastname']");
	//	By txtEmail = By.cssSelector("#input-email");
	//	By txtTel = By.xpath("//input[@id='input-telephone']");
	//	By txtPass = By.xpath("//input[@id='input-telephone']");
	//	By txtConfirmPass = By.xpath("//input[@id='input-telephone']");
		
		
		

	}

	public static void getElement(By locator)
	{
		driver.findElement(locator);
	}
	
	
}
