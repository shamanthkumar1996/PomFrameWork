package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Generic.Auto_constant;
import Generic.Excel;
import Pom.Login;

import Pom.Home;


public class DropDownMenu implements Auto_constant{
	static{
		System.setProperty(key,value);
	}
	public static void main(String[] args) throws InterruptedException{
		String us=Excel.abc(excelpath,"Sheet1",2,3);
		String pass=Excel.abc(excelpath,"Sheet1",3,3);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.voonik.com");
		Login s=new Login(driver);
		s.login();
		Thread.sleep(2000);
		s.username(us);
		Thread.sleep(2000);
		s.password(pass);
		Thread.sleep(2000);
		System.out.println(us);
		System.out.println(pass);
		
		s.submit();
		Thread.sleep(5000);
		
		Home p=new Home(driver);
		Actions a1=new Actions(driver);
		WebElement  z=p.womenhover();
		a1.moveToElement(z).perform();
		WebElement  y=p.Indiandress();
		a1.moveToElement(y).perform();
		WebElement  x=p.viewing();
		a1.moveToElement(x).perform();
		x.click();
	
        
	}
	}

