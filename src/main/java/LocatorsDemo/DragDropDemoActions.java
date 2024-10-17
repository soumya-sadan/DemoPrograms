package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropDemoActions {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		driver.get("https://practice.expandtesting.com/drag-and-drop");
		driver.manage().window().maximize();
		
		Actions actions=new Actions(driver);
		By source = By.xpath("//div[@id='column-a']");
		By target = By.xpath("//div[@id='column-b']");
		WebElement ele1 = driver.findElement(source);
		WebElement ele2 = driver.findElement(target);
		//method 1
		//actions.clickAndHold(ele1).moveToElement(ele2).release().build().perform();
		
		// method 2 -  use dragAndDrop() method introduced since selenium 3
		actions.dragAndDrop(ele1, ele2).perform();
		Thread.sleep(3000);
		
		System.out.println("success");
		driver.quit();
		

	}

}
