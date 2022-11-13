package PageLayers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.TestBase;

public class ContacUs extends TestBase {
	public ContacUs() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[@id='contact-link']//child::a")
	private WebElement contacus ;

	@FindBy(xpath="//select[@id='id_contact']")
	private WebElement heading;
	
	@FindBy(xpath="//input[@id='email']")
	private WebElement mail;
	
	@FindBy(xpath="//input[@id='id_order']")
	private WebElement orderid;
	
	@FindBy(xpath="//input[@id='fileUpload']")
	private WebElement file;
	
	@FindBy(xpath="//textarea[@id='message']")
	private WebElement massage ;
	
	@FindBy(xpath="//button[@id='submitMessage']")
	private WebElement submit;
	
	
	
	
	
	public void ClickOnContactUs() {
		contacus.click();
	}
	public void Selectheading() throws InterruptedException {
		Select s= new Select(heading);
		
		s.deselectByIndex(0);
	}
	public void InputMail() {
		mail.sendKeys("anupnehe@2931@gmail.com");
	}
	public void InputOrderId() {
		orderid.sendKeys("#5762365");
	}
	public void UploadFile() {
		file.sendKeys("C:/User/Images");
	}
	public void massage() {
		massage.sendKeys("detail description");
	}
	public void ClickOnSubmit() {
		submit.click();
	}
}
