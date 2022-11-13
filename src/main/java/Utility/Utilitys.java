package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import TestBase.TestBase;

public class Utilitys extends TestBase{
	public void Utilitys() {
		PageFactory.initElements(driver, this);
	}

	public static void takess(String name)  {
		TakesScreenshot ts= ((TakesScreenshot)driver);
		 File src=ts.getScreenshotAs(OutputType.FILE);
		 
		String path="C:\\Users\\ANUP\\eclipse-workspace\\demotest\\screenshot\\";
		File des = new File(path+name+".png");
		try {
			FileHandler.copy(src, des);
		} catch (IOException e) {
			System.out.println("file not found");
			e.printStackTrace();
		}
	}

}
