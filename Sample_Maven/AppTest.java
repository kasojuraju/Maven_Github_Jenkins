package com.test.Sample_Maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest{
	
	WebDriver d;
	@BeforeClass
	public void browserinit(){
		System.setProperty("webdriver.chrome.driver", "D:\\Nag\\chromedriver.exe");
		d=new ChromeDriver();
	}
	
	@Test
	public void sample_Test(){
		d.get("https://www.javatpoint.com/java-arraylist");
		System.out.println("Sample Test annotation for Maven, Github and Jenkins configuration");
		d.findElement(By.xpath("//*[@id='smoothmenu1']/ul/li[6]/a")).click();
	}
	@AfterClass
	public void browserClose(){
		d.close();
	}
}