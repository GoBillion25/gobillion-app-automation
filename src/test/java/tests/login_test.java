<<<<<<< HEAD
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

public class login_test extends BaseClass{

	@Test
	public void Login() throws Exception{
		//click for entering phone Number
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/loginPhone")).click();
		Thread.sleep(3000);
		//Enters Mobile No
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/loginPhone")).sendKeys("6001600256");
		Thread.sleep(3000);
		System.out.println("Phone Number Entered Successfully");
		//click for entering password
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/loginPassword")).click();
		Thread.sleep(3000);
		//Enters Password
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/loginPassword")).sendKeys("Abc123###");
		Thread.sleep(3000);
		System.out.println("Password entered successfully");
		//press android back button for hiding keyboard
		driver.navigate().back();
		Thread.sleep(3000);
		//Click on Sign IN button
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/loginButton")).click();
		System.out.println("Login Details matched");
	}

=======
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

public class login_test extends BaseClass{

	@Test
	public void Login() throws Exception{
		//click for entering phone Number
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/loginPhone")).click();
		Thread.sleep(3000);
		//Enters Mobile No
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/loginPhone")).sendKeys("6001600256");
		Thread.sleep(3000);
		System.out.println("Phone Number Entered Successfully");
		//click for entering password
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/loginPassword")).click();
		Thread.sleep(3000);
		//Enters Password
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/loginPassword")).sendKeys("Abc123###");
		Thread.sleep(3000);
		System.out.println("Password entered successfully");
		//press android back button for hiding keyboard
		driver.navigate().back();
		Thread.sleep(3000);
		//Click on Sign IN button
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/loginButton")).click();
		System.out.println("Login Details matched");
	}

>>>>>>> 386448845b3f1f7ff060eedd9b8e95320c367906
}