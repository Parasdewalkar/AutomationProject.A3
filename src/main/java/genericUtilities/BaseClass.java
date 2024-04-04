package genericUtilities;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import objectRepository.homePage;
import objectRepository.loginPage;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class BaseClass {
	
	public PropertyFileUtility pUTIL = new PropertyFileUtility();
	public ExcelFileUtility eUTIL = new ExcelFileUtility();
	public SeleniumUtility sUTIL = new SeleniumUtility();
	public WebDriver driver;
	
//	For Listeners
	public static WebDriver sDriver;

	@BeforeSuite
	public void bsconfig() {
		System.out.println("DataBase connected successfully");
	}
	
	@BeforeClass
	public void browserLunch() throws IOException {
		String URL = pUTIL.readDataFromPropertyFile("url");
		
		 driver = new FirefoxDriver();
		 sUTIL.maximizeWindow(driver);
		 sUTIL.addImplicitlyWait(driver);
		 
		 
		 driver.get(URL);
		 
		 //For Listeners
		 sDriver = driver;
		 
		 
		 System.out.println("Browser Launched");
		 
	}
	
	@BeforeMethod
	public void loginToApp() throws IOException {
		
		String USERNAME = pUTIL.readDataFromPropertyFile("username");
		String PASSWORD = pUTIL.readDataFromPropertyFile("password");
		
		
		
		loginPage lpage = new loginPage(driver);
		lpage.loginApp(USERNAME, PASSWORD);
		
		System.out.println("logged in successfully");
	}
	
	@AfterMethod
	public void logout() throws InterruptedException {
		homePage hpage = new homePage(driver);
		hpage.logoutApp(driver);
		
		System.out.println("logged out successfully");
	}
	
	@AfterSuite
	public void dataBaseClosure() {
		System.out.println("Database Closure");
	}
}
