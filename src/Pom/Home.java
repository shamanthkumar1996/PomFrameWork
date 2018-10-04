package Pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Home{

	@FindBy(xpath="//p[.='Track order']")//no space to link text
	private WebElement track;

	
	@FindBy(xpath="//p[.='bag']")//no space to link text
	private WebElement bag;
	@FindBy(xpath="//p[.='Casual Shoes']")//no space to link text
	private WebElement CasualShoes;
	
	@FindBy(xpath="(//img[@alt='Artery Trendy Premium Quality Casual Shoes / Sneakers'])[1]")//Extra not part of home 
	private WebElement Favshoe;
	@FindBy(xpath="//label[.='9']")//no space to link text
	private WebElement Size;
	@FindBy(xpath="//button[.='buy now']")//no space to link text
	private WebElement Buy;
	@FindBy(xpath=("//a[.='Women']"))
	private WebElement Womenh;
    
	@FindBy(xpath=("//span[.='Indian Wear']"))
	private WebElement indian;
	
	@FindBy(xpath=("//a[.='View All']"))
	private WebElement viewer;
	
	@FindBy(xpath=("//a[.='Download App']"))
	private WebElement app;
	
	@FindBy(xpath=("//a[.='Blog']"))
	private WebElement blg;
	
	@FindBy(xpath=("//a[.='Media']"))
	private WebElement mediaa;
	
	@FindBy(xpath=("//a[@class='post-nav-older fleft']"))
	private WebElement old;
	@FindBy(xpath=("//a[.='Beauty']"))
	private WebElement bty;
	@FindBy(xpath=("//a[.='My Style Preference'] "))
	private  WebElement style;
	@FindBy(xpath=(" //button[.='FEMALE'] "))
	private  WebElement fmale;
	@FindBy(xpath=(" //p[.='next']  "))
	private  WebElement next;
	@FindBy(xpath=(" //p[.='back']  "))
	private  WebElement back;
	@FindBy(xpath="//p[.=\"USA\"]")
	private WebElement shipTodropdown;
	@FindBy(xpath=(" //p[.='Wishlist']  "))
	private  WebElement Wishlisttb;

	
		
	
	

	



	
	
	public Home(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void trackbt(){
		track.click();
	}
	
	public void bagbt(){
		bag.click();
	}
	public void CasualShoesbt(){
		CasualShoes.click();
	}
	public void Favshoebt(){
		Favshoe.click();
	}
	public void Sizebt(){
		Size.click();
	}
	public void Buybt(){
		Buy.click();
	}
	public WebElement womenhover()
	{
     WebElement ele=Womenh;
     return ele;
     }
	public WebElement Indiandress()
	{
     WebElement ele2=indian;
     return ele2;
     }
	public WebElement viewing()
	{
     WebElement ele3=viewer;
     return ele3;
     }
	public void  dload()
	{
    app.click();
     }
	public void  blogging()
	{
   blg .click();
     }
	public void  mdia()
	{
  mediaa.click();
     }
	public void  oldpost()
	{
   old .click();
     }
	public WebElement  beauty()
	{
  WebElement ele4=bty;
  return ele4;
     }
	public void prefer()
	{
		style.click();
	}
	public void femalee()
	{
		fmale.click();
	}
	public void nxt()
	{
		next.click();
	}
	public void bck()
	{
		back.click();
	}
	public void ShipTo()
	{
		shipTodropdown.click();
	}
	public void Wishlisttb()
	{
		Wishlisttb.click();
	}

	
	
	

}
