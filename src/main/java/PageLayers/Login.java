package PageLayers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class Login extends TestBase {
	public Login() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='email_create']")
	private WebElement email;
	
	@FindBy(xpath="//button[@id='SubmitCreate']")
	private WebElement creat;

	
	public void InputEmail() {
		email.sendKeys("anupnehe2931@gmail.com");
	}
	public void ClickOnCreatAccount() {
		creat.click();
		
	}
	
	
}
