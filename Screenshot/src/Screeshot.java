import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.Alert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screeshot {

	public static void main(String[]args) throws IOException, InterruptedException
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amit Saini\\Documents\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://usa.tommy.com/en");
		
		Thread.sleep(2000);
		
		Alert alt = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		String text = alt.getText();
		
		Thread.sleep(2000);
		
		System.out.println(text);
		
		
		
		
		
		
//		driver.manage().window().maximize();
		
		//Take Screenshot in selenium
				// 1st type of method
				
//		TakesScreenshot t = (TakesScreenshot)driver;
		
//		t.getScreenshotAs(null);
		
//		String timestamp = new SimpleDateFormat("yyyy-MM-dd__hh-mm-ss").format(new Date());
//
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//			
//		File past = new File("C:\\Users\\Amit Saini\\Documents\\Testing\\Screenshot\\flipkart" +timestamp+".jpg");
//		
//		FileHandler.copy(src, past);
		
	}
}
