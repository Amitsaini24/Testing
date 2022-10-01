import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlechild {
	
	public static void main(String[]args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Saini\\Documents\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		
		//handle childbrowser
		
		WebElement Alertbox = driver.findElement(By.xpath("(//a[text() ='Try it Yourself »'])[1]"));
		
		WebElement confirmBox = driver.findElement(By.xpath("(//a[text() ='Try it Yourself »'])[2]"));
		
		WebElement Promptbox = driver.findElement(By.xpath("(//a[text() ='Try it Yourself »'])[3]"));
		
		Alertbox.click();
		confirmBox.click();
		Promptbox.click();
		
		String mainpage = driver.getWindowHandle();
		
		System.out.println(mainpage);
		
		ArrayList<String> Addr = new ArrayList<String> (driver.getWindowHandles() );
		
		System.out.println(Addr.get(0));
		System.out.println(Addr.get(1));
		System.out.println(Addr.get(2));
		
		driver.switchTo().window(Addr.get(0));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(Addr.get(1));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(Addr.get(2));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(Addr.get(3));
		System.out.println(driver.getCurrentUrl());
		
		
		
	}

}
