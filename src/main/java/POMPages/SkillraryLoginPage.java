 package POMPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {
	
	//Declaration
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	@FindBy(name = "q")
	private WebElement searchtb;
	
	
	@FindBy(xpath = "//input[@value='go']")
	private WebElement searchbtn;

	
	//Initialisation
	public SkillraryLoginPage(WebDriver driver) {//declare the webdriver
		PageFactory.initElements(driver,this);
	}
	
	//Utilisation
	
	//Create Normal methods for click and sendkeys operations
	//Else create a getter methods
	public void gearsbutton() {
		gearsbtn.click();
	}
	
	public void skillrarydemoapplication() {
		skillrarydemoapp.click();
	}

	public WebElement getSearchtb() {
		return searchtb;
	}
	
	public void searchtextbox(String name) {
		searchtb.sendKeys(name);
	}
	
	public void searchbutton() {
		searchbtn.click();
	}
	
}
