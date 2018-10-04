package Pom;

//package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOut
{
		
	@FindBy(xpath="//a[.=\"Logout\"]")
	private WebElement logout;
	
	public LogOut(WebDriver driver)
	{
		PageFactory.initElements(driver,this);		
	}
	
	public void logoutbutton()
	{
		logout.click();
	}

}
