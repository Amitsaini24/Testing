package Pages;

import java.awt.Desktop.Action;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Messangerpage {
	
	private WebDriver driver;
	
	@FindBy(xpath = "//a[text()= 'Rooms']") 
	private WebElement roomsButton;
	
	@FindBy(xpath = "//a[text()= 'Features']") 
	private WebElement featuresButton;
	
	public Messangerpage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void openrooms() {
//		Actions act = new Actions(driver);
//		act.moveToElement(featuresButton);
		roomsButton.click();
	}
	
	public void openfeatures() {
		featuresButton.click();
	}

}
