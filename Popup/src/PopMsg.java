import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopMsg {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver" , "C:\\Users\\Amit Saini\\Documents\\Testing\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://usa.tommy.com/en");
		
		Thread.sleep(2000);
//		
//		Alert alt = driver.switchTo().alert();
//		
//		alt.dismiss();
	}

}
