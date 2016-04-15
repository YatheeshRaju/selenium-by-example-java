package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWaitDemo {
	
	@Test
	public void explicitWaitDeom() throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.learn-selenium.net/");

		//Explicitily  wait for 10 seconds
		WebElement myelement = (new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/nav/div/div[1]/a[2]")));
		
		System.out.println(myelement.getText().toString());
	
		// Maximize the Browser Window.
		driver.manage().window().maximize(); 
		//Close the browser
		driver.close();
		//
	}

}
 