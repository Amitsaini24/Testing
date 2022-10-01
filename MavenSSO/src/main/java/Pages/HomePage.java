package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//input[@id='cpBody_txt_Data1']") 
	private WebElement UserNameBox;
	
	@FindBy(xpath = "//input[@id='cpBody_txt_Data2']")
	private WebElement PasswordBox;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void SendusernameBox() {
		UserNameBox.sendKeys("amit.indoriya213");
	}
	
	public void SendpasswordBox() {
		PasswordBox.sendKeys("Saini@123");
	}

}
