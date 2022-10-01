package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class signup {
	
	public static void main (String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Saini\\Documents\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		Thread.sleep(3000);
		
		WebElement CreateAccount = driver.findElement(By.xpath("//a[@data-testid=\'open-registration-form-button\']"));
		
		CreateAccount.click();
		
		WebElement Firstname = driver.findElement(By.xpath("//input[@name='firstname']"));
		
		Firstname.sendKeys("Amit");
		
		Thread.sleep(2000);
		
				
		
		
		
		
	
	}

}
