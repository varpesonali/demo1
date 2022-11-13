package PageLayers;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import TestBase.TestBase;

public class RegisterDetails extends TestBase{
	public RegisterDetails() {
		PageFactory.initElements(driver, this);
	}
	



@FindBy(xpath="//div[@id='uniform-id_gender1']")
private WebElement gender;

@FindBy(xpath="//input[@id='customer_firstname']")
private WebElement firstname;

@FindBy(xpath="//input[@id='customer_lastname']")
private WebElement lastname;

@FindBy(xpath="//input[@id='passwd']")
private WebElement password;

@FindBy(xpath="//select[@id='days']")
private WebElement day;

@FindBy(xpath="//select[@id='months']")
private WebElement month;

@FindBy(xpath="//select[@id='years']")
private WebElement year;




public void ClickOnGender() {
	gender.click();
}
public void InputFirstName() {
	firstname.sendKeys("anup");
}
public void InputLastName() {
	lastname.sendKeys("nehe");
}
public void InputPassword() {
	password.sendKeys("******");
}
public void SelectDay() {
	day.click();
	Select s=new Select(day);
	s.deselectByVisibleText("11");
}
public void Selectmonth() {
	month.click();
	Select s =new Select(month);
	s.deselectByVisibleText("April ");
}
public void Selectyear() {
	year.click();
	Select s = new Select(year);
	s.deselectByVisibleText("2022");
}

}
