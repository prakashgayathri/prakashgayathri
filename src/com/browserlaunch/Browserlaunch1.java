package com.browserlaunch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.grid.web.servlet.handler.WebDriverRequestFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browserlaunch1 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ACER\\eclipse-workspace\\Javabasic\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
	
//	driver.navigate().to("https://www.flipkart.com/");
//	driver.get("https://www.flipkart.com/");
//	
//	driver.navigate().to("https://www.amazon.in/");
//	driver.get("https://www.amazon.in/");
	TakesScreenshot ts=(TakesScreenshot)driver;
	File Source=ts.getScreenshotAs(OutputType.FILE);
	File Destination = new File("C:\\Users\\ACER\\eclipse-workspace\\Selenium\\Screenshot\\flip.png");
	FileUtils.copyFile(Source, Destination);
	
	
	
//	driver.navigate().back();
//	Thread.sleep(3000);
//	
//	String title=driver.getTitle();
//	System.out.println(title);
//	String url=driver.getCurrentUrl();
//	System.out.println(url);
//	
//	driver.navigate().forward();
//	Thread.sleep(3000);
//	
//	String title1=driver.getTitle();
//	System.out.println(title1);
//	String url1=driver.getCurrentUrl();
//	System.out.println(url1);
//	
//	Thread.sleep(5000);
//	driver.navigate().to("https://www.instagram.com/accounts/login/");
//	driver.get("https://www.instagram.com/accounts/login/");
//	
//	String title2=driver.getTitle();
//	System.out.println(title2);
//	
//	
	driver.quit();
	
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
