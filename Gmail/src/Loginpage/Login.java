package Loginpage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	
	public static void main(String[]args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Saini\\Documents\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/intl/en_in/gmail/about/");
		
		Thread.sleep(3000);
		
		WebElement SignIn = driver.findElement(By.xpath("//a[text() ='Sign in']"));
		
		SignIn.click();
		
		WebElement username = driver.findElement(By.xpath("//input[@id=\'identifierId']"));
		
		username.sendKeys("riya.fille1997@gmail.com");
		
		Thread.sleep(5000);
		
		WebElement Next = driver.findElement(By.xpath("//span[text() ='Next']"));
		
		Next.click();
		
		
//		WebElement password = driver.findElement(By.xpath("//input[@name=\'Passwd']"));
//		
//		password.sendKeys("Jerry@123");
//		
		
		
		
	}

}
