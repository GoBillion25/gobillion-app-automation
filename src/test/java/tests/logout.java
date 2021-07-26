package tests;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities; //Used to set device properties:device name, platform, version, app package name, activity name, etc. It has various methods eg. setCapability()-> used to set the device name, platform version, platform name, absolute path of the app under test (the .apk file of the app(Android) under test), app Activity (in Android) and appPackage(java).
import org.testng.annotations.AfterTest; //@AfterTest annotated method will be executed when all @Test annotated methods completed its execution
import org.testng.annotations.BeforeTest; //@Before Test annotated method will be executed before any @Test method
import org.testng.annotations.Test; //@Test annotation describes method as a test method or part of your test

public class logout extends BaseClass{

	@Test
	public void Logout() {
		try {
			
		
		//click hamburger button
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();
		Thread.sleep(3000);
		System.out.println("Hamburger button clicked");
		
		//click logout
		driver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@resource-id,'design_menu_item_text') and @text='Log Out']")).click();
		Thread.sleep(3000);
		System.out.println("Account logged out");
	} catch(Exception e){}
	}
}

//class  android.widget.CheckedTextView
//package com.gobillion.android.commerce.dev
//text Log Out
//resource id com.gobillion.android.commerce.dev:id/design_menu_item_text