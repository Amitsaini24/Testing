package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Messangerpage;
import Pages.Rooms;
import Pages.loginOrSignupPage;

public class TestClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Saini\\Documents\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		loginOrSignupPage loginOrSignupPage = new loginOrSignupPage(driver);
		
		loginOrSignupPage.openMessenger();
		
		Messangerpage messangerpage = new Messangerpage(driver);
		messangerpage.openrooms();
		
		Rooms rooms = new Rooms(driver);
		rooms.goBacktomessanger();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if(url.equals("https://www.messenger.com/") && title.equals("Messenger")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
