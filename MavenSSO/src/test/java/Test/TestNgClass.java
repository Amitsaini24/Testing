package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.HomePage;

public class TestNgClass {
	
	private WebDriver driver;
	private HomePage homepage;
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("BeforeClass");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Saini\\Documents\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforemethod");
		driver.get("https://sso.rajasthan.gov.in/signin");
		homepage = new HomePage(driver);
		homepage.SendusernameBox();
		homepage.SendpasswordBox();
				
		
	}
	
	@Test
	public void test() {
		System.out.println("Test1");
	}
	
	@Test
	public void test2() {
		System.out.println("Test2");
	}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("afterClass");
	}
}
