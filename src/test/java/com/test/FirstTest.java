package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FirstTest {
	public static WebDriver wd;
	@Parameters("myBrowser")
	@BeforeClass
	public static void launchBrowser(String myBrowser) throws InterruptedException
	{
		Thread.sleep(4000);
		if(myBrowser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "E:\\Library\\chromedriver.exe");
		  wd=new ChromeDriver();}
		else if(myBrowser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "E:\\Library\\geckodriver.exe");
		  wd=new FirefoxDriver();
		  Thread.sleep(4000);}
	}
	
  @Test
  public void f1() throws InterruptedException {
  wd.get("https://www.google.com");
  Thread.sleep(4000);
  wd.findElement(By.name("q")).sendKeys("selenium");
  Assert.assertEquals("hi", "hi");
  }
  @Test
  public void f2() throws InterruptedException {
	  Thread.sleep(4000);
  wd.findElement(By.id("q")).sendKeys(Keys.ENTER);
  Assert.assertEquals("hi", "hi");
  }
}
