package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginOrSignupPage {
	
	//Variables
	@FindBy(xpath = "//input[@id='email']") 
	private WebElement userName ;
	
	@FindBy(xpath = "//input[@id='pass']") 
	private WebElement passWord ;
	
	@FindBy(xpath = "//button[text()='Log in']") 
	private WebElement Loginbutton ;
	
	@FindBy(xpath = "//a[text()='Messenger']") 
	private WebElement Messanger ;
	
	
	//Initilization variable
	
	public loginOrSignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Variable use
	
	public void senduserName() {
		userName.sendKeys("risingamit24");
	}
	
	public void sendpassWord() {
		passWord.sendKeys("Amit@123");
	}
	
	public void clickonLoginbutton() {
		Loginbutton.click();
	}
	
	public void openMessenger() {
		Messanger.click();
	}
	
	//OR
	
	public void LogintoApplication() {
		userName.sendKeys("risingamit24");
		passWord.sendKeys("Amit@123");
		Loginbutton.click();
	}
	
}
