package com.example;

import java.util.Calendar;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ImplicitWaitDemo {
	
	@Test
	public void implicitWaitDemo () throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		
		//Print the current time
		System.out.println(Calendar.getInstance().getTime());
		//Implicitily wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.learn-selenium.net/");
		//print current time
		System.out.println(Calendar.getInstance().getTime());
		// Maximize the Browser Window.
		driver.manage().window().maximize(); 
		//Close the browser
		driver.close();
	}

}
