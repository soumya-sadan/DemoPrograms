package LocatorsDemo;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://codepen.io/TLadd/pen/PoGoQeV");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String jsPath = "return document.querySelector(\"#shadow-root\").shadowRoot.querySelector(\"button\")";
	WebElement webEle = (WebElement)js.executeScript(jsPath);
	webEle.click();
	
	//document.querySelector("label[for='input-firstname']")
		
		

	}

}
