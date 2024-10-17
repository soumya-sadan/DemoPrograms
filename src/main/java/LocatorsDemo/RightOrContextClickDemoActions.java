package LocatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class RightOrContextClickDemoActions {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		Actions actions=new Actions(driver);
		actions.contextClick(driver.findElement(By.xpath("//span[text()='right click me']"))).perform();
		// ignored li for seperator using "not" of CSS
		List<WebElement> menuItems = driver.findElements(By.cssSelector("ul.context-menu-list > li:not(li.context-menu-not-selectable)")); // > stands for direct child
		//List<WebElement> menuItems = driver.findElements(By.cssSelector("ul.context-menu-list span")); // OR fetch using span. space before span stands for indirect child
	    
	    
		for(WebElement e : menuItems)
	    {
	    	System.out.println(e.getText());
	    }
	  
	    driver.quit();
	}
	

}
