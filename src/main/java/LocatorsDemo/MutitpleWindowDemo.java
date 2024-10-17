package LocatorsDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class MutitpleWindowDemo {
	

	    public static void main(String[] args) throws InterruptedException {
	    	
	        // Set up WebDriver (ensure chromedriver is in your system path or provide the path)
	        WebDriver driver = new ChromeDriver();

	        // Navigate to the desired page
	        driver.get("https://www.orangehrm.com/en/book-a-free-demo/");

	        // List of three footer links (adjust the locator based on your page's HTML structure)
	        List<WebElement> footerLinks = driver.findElements(By.xpath("//footer//h5[normalize-space(text())='About Us']//following-sibling::ul//li/a"));

	        // Store the current window handle (the parent window)
	        String parentWindow = driver.getWindowHandle();

	        // Loop through the footer links
	        for (int i = 0; i < footerLinks.size(); i++) {
	            WebElement link = footerLinks.get(i);
	           System.out.println(link.getText());
	            // Open link in a new tab by simulating a Ctrl + Click
	         
	           //link.click();
	          
	           link.sendKeys(Keys.CONTROL, Keys.RETURN);
	          

	            // Get all window handles
	            Set<String> allWindowHandles = driver.getWindowHandles();

	            // Remove the parent window handle from the set to get the new window handle
	            allWindowHandles.remove(parentWindow);

	            // The remaining handle in the set is the new window handle
	            String newWindowHandle = allWindowHandles.iterator().next();

	            // Switch to the new tab/window
	            driver.switchTo().window(newWindowHandle);
	            Thread.sleep(2000);

	            // Print the title of the new tab (just as an example action)
	           // System.out.println(footerLinks);
	            System.out.println("Opened page title: " + driver.getTitle());

	            // Close the new tab
	            driver.close();

	            // Switch back to the parent window
	            driver.switchTo().window(parentWindow);
	            System.out.println(driver.getTitle());
	        }

	        // Close the browser
	        driver.quit();
	    }
	}


