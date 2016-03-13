package com.example;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



	public class TakeScreenShot {
	 @Test 
	 public void TakeScreenShotof() throws InterruptedException, IOException{
	  WebDriver driver=new FirefoxDriver();
	  driver.get("http://www.learn-selenium.net/");
	  driver.manage().window().maximize();
	  File ScrnShot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  FileUtils.copyFile(ScrnShot,new File("\\screenShot.png")); // Path to save the screen Shot
	  
	  
	  driver.close();
	 }

	}