package Pages;

//import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy (xpath = "//a[text() = 'MEN']") 
	private WebElement menmenu;
	
	@FindBy (xpath = "//a[text() = 'WOMEN']") 
	private WebElement womenmenu;
	
	@FindBy (xpath = "//a[text() = 'KIDS']") 
	private WebElement kidsmenu;
	
	@FindBy (xpath = "//a[text() = 'SPORTS']") 
	private WebElement sportsmenu;
	
	@FindBy (xpath = "//a[text() = 'BRANDS']") 
	private WebElement brandsmenu;
	
	@FindBy (xpath = "//a[text() = 'COLLECTIONS']") 
	private WebElement collectionsmenu;
	
	@FindBy (xpath = "//a[text() = 'OUTLET']") 
	private WebElement outletmenu;
	
	@FindBy (xpath = "//input[@class='searchinput___zXLAR']") 
	private WebElement searchbox;
	
	@FindBy (xpath = "//button[@data-auto-id='profile-icon-header']") 
	private WebElement loginbutton;
	
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickmenmenu() {
		menmenu.click();
	}
	
	public void loginbutton() {
		loginbutton.click();
	}
	
	
	
}
