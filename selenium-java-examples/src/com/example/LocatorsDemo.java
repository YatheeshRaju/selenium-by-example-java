package com.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LocatorsDemo {
	@Test
	public void locatorsDemo () throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.learn-selenium.net/");
		
		// Select an element by id 
		WebElement ele1=driver.findElement(By.id("PopularPosts1"));
		System.out.println(ele1.getText().toString());
		// select an element by name
		WebElement ele2=driver.findElement(By.name("bgresponse"));
		System.out.println(ele2.getText().toString());
		// select an element by class name
		WebElement ele3=driver.findElement(By.className("FeaturedPost"));
		System.out.println(ele3.getText().toString());
		// select an element by tag name
		WebElement ele4=driver.findElement(By.tagName("body"));
		System.out.println(ele4.getText().toString());
		// select an element by link text
		WebElement ele5=driver.findElement(By.linkText("What is Selenium ?"));
		System.out.println(ele5.getText().toString());
		// select an element by partial link text
		WebElement ele6=driver.findElement(By.partialLinkText("What is"));
		System.out.println(ele6.getText().toString());
		// select an element by css class name
		WebElement ele7=driver.findElement(By.cssSelector(".widget-item-control"));
		System.out.println(ele7.getText().toString());
		// select an element by xpath
		WebElement ele8=driver.findElement(By.xpath("//*[@id='PopularPosts1']/div/ul/li[2]/a"));
		System.out.println(ele8.getText().toString());
		
		 driver.close();
	}
	

}

