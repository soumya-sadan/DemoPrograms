package LocatorsDemo;

import org.openqa.selenium.HasAuthentication;
import org.openqa.selenium.UsernameAndPassword;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthUsingHasAuthentication {
	
	 public static void main(String[] args) {
		 
		 WebDriver driver = new ChromeDriver();

			 
		 //Handling Basic Authentication popup
		 
		//**method1** - supplying creds along with URL separated by : and ends with @
		 
		 driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			
		//**method 2** 
		WebDriver driver2 = new ChromeDriver();
		HasAuthentication auth = (HasAuthentication) driver2;
		auth.register(UsernameAndPassword.of("admin","admin"));
		driver2.get("https://the-internet.herokuapp.com/basic_auth");
	}

}
