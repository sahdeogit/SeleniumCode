package com.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;


public class CustomListener extends TestListenerAdapter{
	
	@Override
	public void onTestFailure(ITestResult tr) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		File src=((TakesScreenshot)FirstTest.wd).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File("E:\\FailedTestCase\\"+tr.getName()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSuccess(ITestResult tr) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("E:\\PassTestCase\\"+tr.getName()+".png");
	}

}
