package com.example;

import static org.monte.media.FormatKeys.EncodingKey;
import static org.monte.media.FormatKeys.FrameRateKey;
import static org.monte.media.FormatKeys.KeyFrameIntervalKey;
import static org.monte.media.FormatKeys.MIME_AVI;
import static org.monte.media.FormatKeys.MediaTypeKey;
import static org.monte.media.FormatKeys.MimeTypeKey;
import static org.monte.media.VideoFormatKeys.CompressorNameKey;
import static org.monte.media.VideoFormatKeys.DepthKey;
import static org.monte.media.VideoFormatKeys.ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE;
import static org.monte.media.VideoFormatKeys.QualityKey;

import java.awt.AWTException;
import java.awt.GraphicsConfiguration;
import java.awt.GraphicsEnvironment;
import java.io.IOException;

import org.monte.media.Format;
import org.monte.media.FormatKeys.MediaType;
import org.monte.media.math.Rational;
import org.monte.screenrecorder.ScreenRecorder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RecordBrowserAsVideo {
	private static ScreenRecorder screenRecorder;
	@Test
	public void  recodvideo() throws InterruptedException, IOException, AWTException{

	      GraphicsConfiguration gconfig = GraphicsEnvironment
	         .getLocalGraphicsEnvironment()
	         .getDefaultScreenDevice()
	         .getDefaultConfiguration();
	      
	      screenRecorder = new ScreenRecorder(gconfig,
	         new Format(MediaTypeKey, MediaType.FILE, MimeTypeKey,
	         MIME_AVI),
	         new Format(MediaTypeKey, MediaType.VIDEO, EncodingKey,
	         ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	         CompressorNameKey, ENCODING_AVI_TECHSMITH_SCREEN_CAPTURE,
	         DepthKey, (int)24, FrameRateKey, Rational.valueOf(15),
	         QualityKey, 1.0f,
	         KeyFrameIntervalKey, (int) (15 * 60)),
	         new Format(MediaTypeKey, MediaType.VIDEO,
	         EncodingKey,"black",
	         FrameRateKey, Rational.valueOf(30)), null);
	      
	      WebDriver driver = new FirefoxDriver();
	      driver.manage().window().maximize();
	      
	      screenRecorder.start();
	      
	      
	      
	      // Launch website
	      driver.navigate().to("http://www.learn-selenium.net/");
	      
	      // Maximize the browser
	      
	      Thread.sleep(5000);
	     driver.findElement(By.xpath("//*[@id='FeaturedPost1']/div[1]/h5/a")).click();;
	     Thread.sleep(5000);
	      
	      // Close the Browser.
	      driver.close();
	      
	      // Stop the ScreenRecorder
	      screenRecorder.stop();
	   }
	}
		

