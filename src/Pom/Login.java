



package Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	//decalartion

	@FindBy(xpath="//p[.='Login']")
	private WebElement log;
	@FindBy(id="user_email")
	private WebElement username;
	@FindBy(id="user_password")
	private WebElement password;
	@FindBy(xpath="//button[.='Login']")
	private WebElement sub;
	
         //Initalization  
      public Login(WebDriver driver){
		 PageFactory.initElements(driver, this);
	 }
	
           //utiliation
	public void login(){
		log.click();
		}
	
	public void username(String us){
		username.sendKeys(us);
	}
	
	public void password(String pass){
		password.sendKeys(pass);
	}
	public void submit(){
		sub.click();
		}
	
	




}
