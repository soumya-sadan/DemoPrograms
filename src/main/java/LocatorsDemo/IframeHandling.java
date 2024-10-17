package LocatorsDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
		driver.findElement(By.xpath("//div[@id='imageTemplateContainer']/img")).click();
		Actions act = new Actions(driver);		
		//switching to iframe content
		driver.switchTo().frame("frame-one748593425");
		
		driver.findElement(By.cssSelector("input#RESULT_TextField-1")).sendKeys("Proposal title test");
		driver.findElement(By.cssSelector("input#RESULT_TextField-1")).sendKeys(Keys.TAB);

		act.sendKeys("Location")
		.sendKeys(Keys.TAB)
		.sendKeys("22/05/2024")
		.sendKeys(Keys.TAB)
		.sendKeys("Description wsdsdsad dsqadasdasd ")
		.build().perform();
		
		// to switch back to page
		driver.switchTo().defaultContent();
		
		driver.close();
	}

}
