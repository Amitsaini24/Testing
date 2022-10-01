package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Messangerpage;
import Pages.Rooms;
import Pages.loginOrSignupPage;

public class Verifyvisitourhelp {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Saini\\Documents\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		loginOrSignupPage loginOrSignupPage = new loginOrSignupPage(driver);
		
		loginOrSignupPage.openMessenger();
		
		Messangerpage messangerpage = new Messangerpage(driver);
		messangerpage.openrooms();
		
		Thread.sleep(2000);
		
		Rooms room = new Rooms(driver);
		room.visitorhelp();
		
		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		if(url.equals("https://www.messenger.com") && title.equals("Messenger")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}

}
