package LocatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {

	 static WebDriver driver; //driver made public and static to access from the method and main method

	public static void main(String[] args) throws InterruptedException {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		By searchField = By.name("q");
		By suggestionList = By.xpath("//ul/li[@class='sbct PZPZlf']//div[@class='wM6W7d']/span");
		//call utility method for search
		doSearch(searchField, "selenium", suggestionList, "selenium webdriver");

	}

	public static void doSearch(By searchField, String key, By suggestionList, String suggestionClick)
			throws InterruptedException {
		driver.findElement(searchField).sendKeys(key);
		Thread.sleep(2000);
		// By searchKeys = By.xpath(suggestionList);
		List<WebElement> searchList = driver.findElements(suggestionList);
		// System.out.println(searchList);
		for (WebElement e : searchList) {
			if (e.getText().contains(suggestionClick)) {
				e.click();
				break;
			}
		}

	}

}
