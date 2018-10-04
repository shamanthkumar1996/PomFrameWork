

package Scripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Generic.Auto_constant;
import Generic.Excel;
import Pom.Login;
import Pom.Home;

public class Login_User {
	static{
		System.setProperty("WebDriver.chrome.driver","./software/chromedriver.exe");
	}
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.voonik.com");
		Login s=new Login(driver);
		s.login();
		s.username("shamanth8904@gmail.com");
		s.password("mojojojo");
		s.submit();
		

	}
}

