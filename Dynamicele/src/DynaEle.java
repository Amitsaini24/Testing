import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynaEle {
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Saini\\Documents\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
		
		WebElement Close = driver.findElement(By.xpath("//button[text() = '✕']"));
		
		WebElement Search = driver.findElement(By.xpath("//input[@title=\'Search for products, brands and more\']"));
		
		WebElement Submit = driver.findElement(By.xpath("//button[@type='submit']"));
	
		Close.click();
				
		Search.sendKeys("mobiles");
		
		Submit.click();
		
		String mainpage = driver.getWindowHandle();
		
		System.out.println(mainpage);
		
		ArrayList<String> Addr = new ArrayList<String> (driver.getWindowHandles() );
		
//		System.out.println(Addr.get(0));
		
		driver.switchTo().window(Addr.get(0));
		
		System.out.println(driver.getCurrentUrl());
		
		WebElement price = driver.findElement(By.xpath("(//div[@class='_13oc-S']//div)[21]"));
		
		System.out.println(price);
		
		
		
		
		
		
		
		
	}

}
