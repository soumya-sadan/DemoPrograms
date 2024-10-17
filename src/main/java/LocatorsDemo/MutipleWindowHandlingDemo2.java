package LocatorsDemo;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MutipleWindowHandlingDemo2 {
	 public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();		
		 driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		 System.out.println(driver.getWindowHandle());
		 driver.manage().window().maximize();
		 
		List<WebElement> footerLinks = driver.findElements(By.xpath("//footer//h5[normalize-space(text())='About Us']//following-sibling::ul//li/a"));
		
		String parent = driver.getWindowHandle();
		System.out.println(footerLinks.size());
		System.out.println(driver.getTitle());
		
		
		for(int i=0;i<footerLinks.size();i++)
		{
			//System.out.println(footerLinks.get(i));
			WebElement links = footerLinks.get(i);
			links.sendKeys(Keys.ENTER);
			//System.out.println(links);
			Set<String> allWindows = driver.getWindowHandles();
			System.out.println(allWindows);
			allWindows.remove(parent);
			Iterator<String> it = allWindows.iterator();
			while(it.hasNext())
			{
				
				String currentWindow = it.next();
				driver.switchTo().window(currentWindow);
				System.out.println(driver.getTitle());
				driver.close();
			}
			
			driver.switchTo().window(parent);
			
				
				///Set<String> allWindows = driver.getWindowHandles();
		}
			
			
		System.out.println(driver.getTitle());
		
		driver.quit();		
			
		}
	
		
	}

	

