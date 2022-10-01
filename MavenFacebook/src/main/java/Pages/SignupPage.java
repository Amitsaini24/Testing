package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {
	
	@FindBy(xpath = "//input[@name='firstname']") 
	private WebElement FirstName;
	
	@FindBy(xpath = "//input[@name='lastname']")
	private WebElement lastName;

	@FindBy(xpath = "//input[@name='reg_email__']")
	private WebElement MobileandEmail;
	
	@FindBy(xpath = "//input[@name='reg_passwd__']")
	private WebElement NewpassWord;
	
//	@FindBy(xpath = "//input[@name='']")
//	private WebElement ;
//	
//	@FindBy(xpath = "//input[@name='']")
//	private WebElement ;
//	
//	@FindBy(xpath = "//input[@name='']")
//	private WebElement ;
	
	public SignupPage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void Sendfirstname() {
		FirstName.sendKeys("Amit");
	}
	
	public void Sendlastname() {
		lastName.sendKeys("Saini");
	}
	
	public void Sendmobilenumber() {
		MobileandEmail.sendKeys("989878974");
	}
	
	public void Sendpassword() {
		MobileandEmail.sendKeys("Password");
	}

}
