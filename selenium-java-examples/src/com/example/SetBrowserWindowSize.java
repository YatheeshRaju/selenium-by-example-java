package com.example;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class SetBrowserWindowSize {
	
	@Test
	public void setBrowserWindowSize() throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.learn-selenium.net/");
		driver.manage().window().maximize(); // Maximize the Browser Window.
		Thread.sleep(5000);
		driver.manage().window().setPosition(new Point(0, 0)); //Set position of browser on the screen
		Dimension dim=new Dimension(1024,768);
		driver.manage().window().setSize(dim); // set size of the screen 1024x768
		Thread.sleep(5000);
		dim=new Dimension(500, 700); 
		driver.manage().window().setSize(dim); //set size of screen 500x700 width x height
		Thread.sleep(5000);
		driver.close();
	}

}
