package Demo;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Demoaction {
	public static void main(String[]args) throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Saini\\Documents\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
//		driver.manage().window().maximize();
//		
//		Thread.sleep(2000);
//		
//		WebElement accAndList = driver.findElement(By.xpath("//span[text() = 'Account & Lists']"));
//		
//		WebElement yourOrder = driver.findElement(By.xpath("//span[text() = 'Your Orders']"));
//		
//		Actions act = new Actions(driver);
		
//		act.moveToElement(accAndList).perform();
//		
//		Thread.sleep(2000);
//		
//		act.moveToElement(yourOrder).perform();
//		
//		Thread.sleep(2000);
//		
//		act.click().perform();
//		
//		System.out.println("Pass");
		
//		act.click().perform();    //Left click
//		
//		act.doubleClick();   //Left double click
//		
//		act.contextClick(); // Right click
//		
//		act.moveToElement(null);   //Move mouse focus on target web element
//		
//		act.dragAndDrop(null, null);   //drag source web element and drop on target web element
//		
//		act.build();  // to combine 2 or more action in single seantance
//		
//		act.perform(); // to excute mouse action on the application 
		
		
		
		
		
		//Take Screenshot in selenium
		// 1st type of method
		
			TakesScreenshot t = (TakesScreenshot)driver;
			
			t.getScreenshotAs(null);
		
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
			File past = new File("C:\\Users\\Amit Saini\\Documents\\Testing\\Screenshot\\img.jpg");
		
			FileHandler.copy(src, past);
		
		
	}

}
