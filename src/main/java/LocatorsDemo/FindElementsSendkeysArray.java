package LocatorsDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsSendkeysArray {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		driver.manage().window().maximize();
		
		List<WebElement> inputList = driver.findElements(By.xpath("//input[@class='form-control']"));

	    String[] inputValues = {"soumya", "sadan","soumya@gmail.com","9497685508","sts@1984","sts@1984"};
	
	    
	    Thread.sleep(5000);
	    if(inputList.size()==inputValues.length)
	    {
	    	for(int i=0;i<inputList.size();i++)
	    	{
	     inputList.get(i).sendKeys(inputValues[i]);
	     
	    	}
	    }
	    else
	    {
	    	System.out.println("argument list do not match");
	    }
	
	}

}
