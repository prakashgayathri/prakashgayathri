package com.browserlaunch;

import org.openqa.grid.web.servlet.handler.WebDriverRequestFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;

public class Alert {
public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ACER\\eclipse-workspace\\Javabasic\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Alerts.html");
	driver.manage().window().maximize();
	WebElement button = driver.findElement(By.xpath("//button[@onclick='alertbox()']"));
	button.click();
	driver.switchTo().alert().accept();
	WebElement button1 = driver.findElement(By.xpath("(//a[@data-toggle='tab'])[2]"));
	button1.click();
	WebElement ok= driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
	ok.click();
	Thread.sleep(3000);
	driver.switchTo().alert().dismiss();
	WebElement button2= driver.findElement(By.xpath("(//a[@class='analystic'])[3]"));
	button2.click();
	WebElement d= driver.findElement(By.xpath("(//button[@class='btn btn-info']"));
	d.click();

	System.out.println(driver.switchTo().alert().getText());
	driver.switchTo().alert().sendKeys("gayathri");
	driver.switchTo().alert().accept();
	driver.close();
	
	
	
	
	
	
}
}