package LocatorsDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitMechanismDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		driver.manage().window().maximize();
		
		/*
		// Implicitly wait. 
		//Global wait - applied to all WEs
		//cannot be applied to spececific WEs
		//Cannot be applied to non WEs like title, URL, windows, JS popups.
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4000));
		driver.findElement(By.xpath("//a[@class='store-name']")).click();
		WebElement btnSL = driver.findElement(By.xpath("//button[@class='btn-shopping-drawer inActive']"));
		
		//Explicit wait - WebDriverWait
		//default interval is 500 milliseconds.
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(btnSL));
		System.out.println("success");
		
		//Fluent wait - part of Selenium WebDriver
		//flexibility of defining how frequently to check for the condition 
		//and how long to wait before throwing an exception.
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10)) //maximum time to wait for the condition to be met.
				.pollingEvery(Duration.ofSeconds(2)) // frequency with which the condition will be checked.
				.ignoring(NoAlertPresentException.class) //which exceptions to ignore while waiting.
				.withMessage("----no alert-------");
		wait.until(ExpectedConditions.alertIsPresent());
		*/
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.google.com");
		Thread.sleep(2000);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.yahoo.com");
		
		System.out.println(driver.getTitle());
	}

}
