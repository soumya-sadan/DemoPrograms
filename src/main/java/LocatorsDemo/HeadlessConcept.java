package LocatorsDemo;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadlessConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ChromeOptions co= new ChromeOptions();
		//co.addArguments("--headless");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		
		//WebDriver driver = new ChromeDriver(co);
		WebDriver driver = new FirefoxDriver(fo);
		driver.get("https://www.winndixie.com");
		System.out.println(driver.getTitle());
		//fo.addArguments("--log-level=3");
		//fo.setExperimentalOption("useAutomationExtension", false);
		System.out.println("done");
		driver.quit();
		
		
	}

}
