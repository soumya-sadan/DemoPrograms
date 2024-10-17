package LocatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocatorsDemo 
{
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
				
		//usage of Relative locators
		
		Thread.sleep(3000);
		// to enter value to Firstname text box to the right to label "Firstname"
		//-----EXAMPLE 1 ----------------
		WebElement fnameLabel = driver.findElement(By.cssSelector("label.col-sm-2[for='input-firstname']"));	
		//finding firstname label	
		driver.findElement(with(By.tagName("input")).toRightOf(fnameLabel)).sendKeys("soumya");	
		//sending keys to the input to the right of the above label		
//						         --------------------
//		  				    -------------------------------------------
	
		//-----EXAMPLE 2 ----------------	
		//how to use 'below' to Skip Lastname and enter in Email textbox
		
		WebElement fname = driver.findElement(By.cssSelector("label.col-sm-2[for='input-firstname']")); 		
		WebElement fnameInput = driver.findElement(By.id("input-firstname"));
		WebElement element2 = driver.findElement(with(By.tagName("input")).below(fnameInput));
		driver.findElement(with(By.tagName("input")).below(fnameInput).below(element2)).sendKeys("ss@g.com");
		
		
				
		//-----EXAMPLE 3 ----------------
		//to fetch footer links under "Customer Service" section only
		WebElement footerCC = driver.findElement(By.xpath("//h5[text()=\"Customer Service\"]"));
		WebElement footerCC2 = driver.findElement(By.xpath("//h5[text()=\"Extras\"]"));
		WebElement footerCC1 = driver.findElement(By.xpath("//h5[text()=\"Information\"]"));
		
		
		List<WebElement> links = driver.findElements(with(By.tagName("li")).below(footerCC).toLeftOf(footerCC2).toRightOf(footerCC1));
		for(WebElement e : links)
		{
			System.out.println(e.getText());
		}
	
	 
		
	
	}
	

}