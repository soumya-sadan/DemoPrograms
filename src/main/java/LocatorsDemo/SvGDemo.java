package LocatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SvGDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map/");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.body.style.zoom='65%'");
        js.executeScript("window.scrollBy(0,100);");
      
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'instance')]")));
		 Thread.sleep(2000);
		String svgPath = "//*[local-name()='svg' and @id='map-svg']//*[local-name()='g' and @id='regions']//*[name()='g' and @class='region']//*[name()='path']";
		List<WebElement> ctNames = driver.findElements(By.xpath(svgPath));
		Actions act = new Actions(driver);
		
		System.out.println("test");
		System.out.println(ctNames.size());
		for(WebElement e : ctNames)
		{
			act.moveToElement(e).perform();
			System.out.println(e.getAttribute("name"));
			 Thread.sleep(1000);
		}
	}

}

