package TestCase;

import org.testng.annotations.Test;

import TestBase.TestBase;

public class TestCase extends TestBase {

	
		@Test(priority=1)
		public void VerifyCreatingAccount() throws InterruptedException {
			L.InputEmail();
			L.ClickOnCreatAccount();
		
		}
		
		
		@Test(priority=2)
		public void verifyClicOnGender() throws InterruptedException {
			
			L.ClickOnCreatAccount();
			R.ClickOnGender();
		}
		@Test(priority=3)
		public void VerifyInputFirstName() throws InterruptedException {
			L.InputEmail();
			L.ClickOnCreatAccount();
			R.ClickOnGender();
			R.InputFirstName();
		}
		@Test(priority=4)
		public void VerifyInputLastName() throws InterruptedException {
			L.InputEmail();
			L.ClickOnCreatAccount();
			R.ClickOnGender();
			R.InputFirstName();
			R.InputLastName();
		}
		@Test(priority=5)
		public void InputPassWord() throws InterruptedException {
			L.InputEmail();
			L.ClickOnCreatAccount();
			R.ClickOnGender();
			R.InputFirstName();
			R.InputLastName();
			R.InputPassword();
		}
		
		@Test
		public void ClickOnContacUs() {
			C.ClickOnContactUs();
		}
		@Test
		public void ClicOnDrop() throws InterruptedException {
			C.ClickOnContactUs();
			Thread.sleep(3000);
			C.Selectheading();
			
		}
		@Test
		public void verifyInputMail() {
			C.ClickOnContactUs();
			C.InputMail();
		}
		

	}


