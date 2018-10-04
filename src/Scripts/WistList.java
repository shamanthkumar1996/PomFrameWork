package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic.Auto_constant;
import Generic.Excel;
import Pom.Login;

import Pom.Home;


public class WistList implements Auto_constant{
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
		Thread.sleep(2000);
		
		Home s1=new Home(driver);
		Thread.sleep(2000);
		s1.Wishlisttb();
        

	}

}
