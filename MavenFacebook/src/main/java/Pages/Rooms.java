package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Rooms {
	
	@FindBy(xpath = "//a[text()= ' Return to messenger.com ']") 
	private WebElement returntoMessenger; 

	@FindBy(xpath = "//a[text()= ' Visit our help center ']") 
	private WebElement HelpCenter;
	
	@FindBy(xpath = "//div[text()='This Page isn't available']")
	private WebElement textverify;
	
	public Rooms(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void goBacktomessanger() {
		returntoMessenger.click();
	}
	
	public void visitorhelp() {
		HelpCenter.click();
	}
	
	public void verifytextdisplay() {
		textverify.getText();
		System.out.println(textverify);
	}

}
