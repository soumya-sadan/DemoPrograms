package LocatorsDemo;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSendKeysWithPause {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		
		
		WebElement search = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
		Actions actions=new Actions(driver);
		String keyword = "Selenium";
		char ch[] = keyword.toCharArray();
		
		for(char c :ch)
		{
			actions.sendKeys(search, String.valueOf(c)).pause(200).perform();
			
		}
		
		List<WebElement> list = driver.findElements(By.xpath("//ul[@class='G43f7e']/li//div[@class='wM6W7d']"));
		for (WebElement e1 : list)
		{
			System.out.println(e1.getText());
			//if(e1.getText().contains("selenium testing"))
				if(e1.getText().equals("selenium testing"))
			{
				e1.click();
				break;
			}
		}
	}

}
