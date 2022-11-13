package TestBase;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PageLayers.ContacUs;
import PageLayers.Login;
import PageLayers.RegisterDetails;
import Utility.Utilitys;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	public static WebDriverWait W;
	public static WebDriver driver;
	public static Login L;
	public static RegisterDetails R;
	public static ContacUs C;
	public static Utilitys U;
  @BeforeMethod
public void Setup() {
	String br ="chrome";
	if(br.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	else if(br.equalsIgnoreCase("firfox")) {
		WebDriverManager.firefoxdriver().setup();
		driver =new FirefoxDriver();
	}
	else {System.out.println("select valid browser");}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
  L=new Login();
  R= new RegisterDetails();
  C=new ContacUs();
  U=new Utilitys();
  
  
  
  }
  @AfterMethod
	public void TearDown() {
		driver.quit();
	} 
	
	

}
