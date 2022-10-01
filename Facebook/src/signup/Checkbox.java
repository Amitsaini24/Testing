package signup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {
	
	public static void main(String[]args) throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Saini\\Documents\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement CreateNewAcc = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		
		CreateNewAcc.click();
		
		WebElement custom = driver.findElement(By.xpath("(//input[@type='radio'])[3]"));
		
		custom.click();
		
		WebElement pronoun = driver.findElement(By.xpath("//select[@name='preferred_pronoun']"));
		
		boolean result = pronoun.isDisplayed();
		
		if(result == true)
		{
			System.out.println("Fail");
			
		}
		else {
			System.out.println("Pass");
		}
		
		custom.click();
		
		result = pronoun.isDisplayed();
		
		if(result == true) {
			System.out.println("PASS");
			
		}
		else
		{
			System.out.println("FAIL");
		}
		
		
		
		
	}

}
