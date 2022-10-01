package Test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Pages.Rooms;
import Pages.loginOrSignupPage;

public class TestNGClass2 {
	
private  WebDriver driver;
	
	private Rooms rooms;
	
	private loginOrSignupPage loginOrSignupPage;
	
//	private Messangerpage messangerpage;

	@BeforeClass
		public void launchbrowser() {
		System.out.println("Beforeclass");
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Saini\\Documents\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		driver = new ChromeDriver();
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforementhod");
		
		driver.get("https://www.facebook.com");
		
		loginOrSignupPage = new loginOrSignupPage(driver);
		
		loginOrSignupPage.senduserName();
		
		loginOrSignupPage.sendpassWord();
		
	}
	@Test
	public void test() {
		System.out.println("Test");
		
		loginOrSignupPage.clickonLoginbutton();
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		if(url.equals("https://www.messenger.com")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}	
		
	}
	
//	@Test
//	public void test2() {
//		System.out.println("Test2");
//		
//		rooms.visitorhelp();
//		
//		String url = driver.getCurrentUrl();
//		String title = driver.getTitle();
//		
//		if(url.equals("https://www.messenger.com") && title.equals("Messenger")) {
//			System.out.println("Pass");
//		}
//		else {
//			System.out.println("Fail");
//		}
	
	@AfterMethod
	public void aftermethod() {
		System.out.println("aftermethod");
	}
	@AfterClass
	public void afterclass() {
		System.out.println("AfterClass");
//		driver.close();
	}
	
}
