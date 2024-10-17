package LocatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicTableCricInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver;
		driver = new ChromeDriver();
		driver.get("https://www.espncricinfo.com/series/the-hundred-men-s-competition-2024-1417778/manchester-originals-men-vs-oval-invincibles-men-18th-match-1417807/full-scorecard");
		List<WebElement> scoreCard = driver.findElements(By.xpath("//span[text()='Dawid Malan']/ancestor::td/following-sibling::td//span/parent::td/following-sibling::td"));
		
		for(WebElement e:scoreCard)
		{
			String info = e.getText();
			System.out.println(info);
			
		}

	}

}
