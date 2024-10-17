package UITests;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;

public class BaseTestClass {

	public void setup()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.winndixie.com");
		String title = driver.getTitle();
		Assert.assertTrue(title.contains("winndixie"));
	}
	
	public tearDown()
	{
		
	}
}
