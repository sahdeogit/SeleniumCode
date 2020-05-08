package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTest {
	@Test
	  public void f3() throws InterruptedException {
		Thread.sleep(2000);
	  FirstTest.wd.findElement(By.linkText("Downloads - Selenium")).click();
	  Assert.assertEquals("hellooSir", "hello");
	  }
}
