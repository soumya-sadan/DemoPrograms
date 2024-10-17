package LocatorsDemo;

import java.time.Duration;
//import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

//import pageObjects.HomePageElements;



public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
	/*	try 
		{
		driver.get("https://freecrm.com/index.html");
		Thread.sleep(2000);
		List<WebElement> socialLinks = driver.findElements(By.xpath("//ul[@class='list-inline']/li/a"));
		String[] expectedURLS = {"https://www.facebook.com/getcogmento", "https://x.com/freecrm", "https://www.youtube.com/@freecrmapp", "https://www.linkedin.com/company/freecrmapp"};
		
		//create new string array to store actual urls
		List<String> actualURLS = new ArrayList<>();
				for(WebElement link:socialLinks)
				{
					actualURLS.add(link.getAttribute("href"));
					System.out.println(link.getAttribute("href"));
				}
		
		System.out.println(actualURLS);
		System.out.println(expectedURLS.length);
				for(String ex :expectedURLS)
				{
					boolean flag=false;
				
					for(String act: actualURLS)
					{
						
						if(act.equals(ex))
						{
							flag=true;
							System.out.println("Comparing:");
				              System.out.println("Expected URL: " + ex);
				              System.out.println("Actual URL: " + act);
							break;
						}
						
						//System.out.println("Comparing:");
		               // System.out.println("Expected URL: " + ex);
		                //System.out.println("Actual URL: " + act);
					}
		
		
		Assert.assertTrue(flag, "Not found"+ex);
		}
		}catch(Exception e)
		{
			System.out.println("URL not found");
		}
		*/
		//List<WebElement> socialLinks = ele.getWebElements("XPATH", HomePageElements.headerSocialMedialinks);
		driver.get("https://freecrm.com/index.html");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='list-inline']/li/a")));
		List<WebElement> socialLinks = driver.findElements(By.xpath("//ul[@class='list-inline']/li/a"));
		
		List<String> linkList = new ArrayList<>();
		for(WebElement link:socialLinks)
		{
			linkList.add(link.getAttribute("href"));
			System.out.println(link.getAttribute("href"));
			
		}
		for(String url: linkList)
		{
			
			System.out.println("Navigating to: " + url);

        // Navigate to the URL directly
        driver.get(url);
			//Thread.sleep(2000);
			driver.navigate().back();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='list-inline']/li/a")));
			
			
		}
		
		System.out.println("success");
		driver.quit();
	}
}
	

	


