package UITests;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
	
	/*
	BS - connected to DB
	BT -U ser created
	BC  - Open BWSR
	
		BM  - Open login
		T -register
		AM - logout
	
		BM  - Open login
		T -search
		AM - logout
	
		BM  - Open login
		T -shoppoing cart
		AM - logout
		
		AS  - disconnectDB
	
	*/
	
	@BeforeSuite
	public void connectwithDB() {
		System.out.println("BS - connected to DB");	
	}
	
	@BeforeTest
	public void createuser(){
		System.out.println("BT -U ser created");
	}
	
	@BeforeClass
 
	public void openBrowser(){
		System.out.println("BC  - Open BWSR");
	}
	
	@BeforeMethod
	 
	public void loginToApp(){
		System.out.println("BM  - Open login");
		
	}
	
	@Test (invocationCount=1, priority = 1)
	public void  search(){
		System.out.println("T -search p1");
	}
	
	@Test 
	public void register(){
		System.out.println("T -register p2");
		int n = 9/0;
		n=n+10;
	}
	
	@Test(expectedExceptions = NullPointerException.class)
	public void shoppingCart(){
		System.out.println("T -shoppoing cart - p0");
		LoginTest lt = new LoginTest();
		lt = null;
		lt.search();
		
	}
	
	@Test (dependsOnMethods = "register")
	public void payment(){
		System.out.println("T -payment");
	
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("AM - logout");
	}
	
	@AfterTest
	 
	public void removeUser (){
		System.out.println("AT  - remove user");
	}
	
	@AfterSuite
	 
	public void disconnectDB(){
		System.out.println("AS  - disconnectDB");
	}
	
	
}

