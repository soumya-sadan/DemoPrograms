package LocatorsDemo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowsweMutipleWindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 WebDriver driver = new ChromeDriver();		
		 driver.get("https://www.orangehrm.com/en/book-a-free-demo/");
		 driver.manage().window().maximize();
		// JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		 
		
		WebElement orangeHRMLink = driver.findElement(By.xpath("//a[normalize-space(text())='OrangeHRM']"));
					
		WebElement pressLink = driver.findElement(By.xpath("//h5[text()='About Us']//following::ul//li/a[normalize-space(text())='Press Releases']"));
			
		Actions act = new Actions(driver);
		act.click(orangeHRMLink).perform();
		act.click(pressLink).perform();
				
		//fetch window IDs
		
		Set<String> windows = driver.getWindowHandles();		
		Iterator<String> it = windows.iterator();		
		String parentID = it.next();
		String childID = it.next();
		String childID2 = it.next();
		System.out.println("parent id: " + parentID + "    child ID : " + childID+ " child id 2  " + childID2);

		driver.switchTo().window(childID);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(childID2);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		driver.quit();
		
	
		/*while(it.hasNext())
		{
			String parentID = it.next();
			String childID = it.next();
		}
		*/
	}

}
