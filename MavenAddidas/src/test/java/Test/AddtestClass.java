package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.HomePage;

public class AddtestClass {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Saini\\Documents\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.adidas.co.in");
		
		HomePage homePage = new HomePage(driver);
		
		homePage.loginbutton();
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
	}

}
