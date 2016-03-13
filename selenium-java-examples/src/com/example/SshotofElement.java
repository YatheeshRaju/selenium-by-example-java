package com.example;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class SshotofElement {
	
	@Test
	public void screenShotElement() throws InterruptedException,IOException {
		 WebDriver driver=new FirefoxDriver();
		  driver.get("http://www.learn-selenium.net/");
		  driver.manage().window().maximize();
		  WebElement element=driver.findElement(By.xpath("//*[@id='PopularPosts1']")); // Xpath of element to take screen shot
		  
		  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); // Take full screen screenshot
		  BufferedImage  fullImg = ImageIO.read(screenshot);
		  Point point = element.getLocation();
		  int elementWidth = element.getSize().getWidth();
		  int elementHeight = element.getSize().getHeight();
		  BufferedImage elementScreenshot= fullImg.getSubimage(point.getX(), point.getY(), elementWidth,elementHeight); // crop the image to required
		  ImageIO.write(elementScreenshot, "png", screenshot);
		  FileUtils.copyFile(screenshot, new File("mostread_screenshot.png"));//path to save screen shot
		  
		  
		  driver.close();
		
	}

}
