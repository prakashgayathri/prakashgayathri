package com.browserlaunch;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {
public static void main(String[] args) throws IOException, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ACER\\eclipse-workspace\\Javabasic\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");

	driver.manage().window().maximize();
	TakesScreenshot ts=(TakesScreenshot) driver;
	File Source= ts.getScreenshotAs(OutputType.FILE);
	File Destination = new File("C:\\Users\\ACER\\eclipse-workspace\\Selenium\\Screenshot\\amazon.png");
    FileUtils.copyFile(Source, Destination);
    Thread.sleep(3000);
}
	
	
	
}
