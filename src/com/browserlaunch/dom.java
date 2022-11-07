package com.browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dom {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ACER\\eclipse-workspace\\Javabasic\\Driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
//	Point p=new Point(350,300);
//    driver.manage().window().setPosition(p);
//    Dimension d=new Dimension(500,250);
//    driver.manage().window().setSize(d);
	Thread.sleep(3000);
    WebElement mail = driver.findElement(By.xpath("(//input[@name='email'])"));
    mail.sendKeys("prakashgayathri02@gmail.com");
    WebElement ps = driver.findElement(By.xpath("(//input[@id='pass'])"));
    ps.sendKeys("dharshan4784");
    WebElement button = driver.findElement(By.xpath("(//button[@id='loginbutton'])"));
    button.click();

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}