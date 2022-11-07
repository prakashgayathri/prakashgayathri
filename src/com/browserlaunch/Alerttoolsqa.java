package com.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerttoolsqa {
	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\ACER\\eclipse-workspace\\Javabasic\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demoqa.com/alerts");
	driver.manage().window().maximize();
	WebElement button1 = driver.findElement(By.id("alertButton"));
	button1.click();
	driver.switchTo().alert().accept();
	WebElement button2 = driver.findElement(By.id("timerAlertButton"));
	button2.click();
	driver.switchTo().alert().accept();
	WebElement select = driver.findElement(By.xpath(("//span[@class='mr-3'])[3]")));
	select.click();
	WebElement button3 = driver.findElement(By.id("confirmButton"));
	button3.click();
	driver.switchTo().alert().dismiss();
	WebElement button4 = driver.findElement(By.id("promtButton"));
	button4.click();
	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().sendKeys("gayathri");
	driver.switchTo().alert().accept();
	driver.close();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}