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

public class address extends BaseClass{

	@Test
	public void Address() throws Exception{
		//click for address
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/home_address_text")).click();
		Thread.sleep(3000);

		//click plus sign
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/imageView9")).click();
		Thread.sleep(3000);

		//click for entering name
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_UserName")).click();
		Thread.sleep(3000);
		//Enters name
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_UserName")).sendKeys("sssppp");
		Thread.sleep(3000);
		System.out.println("name entered successfully");

		//click for entering phone number
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_phone")).click();
		Thread.sleep(3000);
		//Enters phone no.
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_phone")).sendKeys("7810111111");
		Thread.sleep(3000);
		System.out.println("phone no. entered successfully");

		//click for choosing apartment
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_choose_appartments")).click();
		Thread.sleep(3000);
		//Enters street address
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")).click();
		Thread.sleep(3000);
		System.out.println("street address added successfully");

		//click for entering flat no
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_flat_no")).click();
		Thread.sleep(3000);
		//Enters flat no.
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_flat_no")).sendKeys("enterTheLandmark");
		Thread.sleep(3000);
		System.out.println("flat no entered successfully");

		//press android back button for hiding keyboard
		driver.navigate().back();
		Thread.sleep(3000);
		//Click on add address button
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_submit_button")).click();
		System.out.println("address added successfully");
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

public class address extends BaseClass{

	@Test
	public void Address() throws Exception{
		//click for address
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/home_address_text")).click();
		Thread.sleep(3000);

		//click plus sign
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/imageView9")).click();
		Thread.sleep(3000);

		//click for entering name
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_UserName")).click();
		Thread.sleep(3000);
		//Enters name
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_UserName")).sendKeys("sssppp");
		Thread.sleep(3000);
		System.out.println("name entered successfully");

		//click for entering phone number
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_phone")).click();
		Thread.sleep(3000);
		//Enters phone no.
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_phone")).sendKeys("7810111111");
		Thread.sleep(3000);
		System.out.println("phone no. entered successfully");

		//click for choosing apartment
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_choose_appartments")).click();
		Thread.sleep(3000);
		//Enters street address
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView")).click();
		Thread.sleep(3000);
		System.out.println("street address added successfully");

		//click for entering flat no
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_flat_no")).click();
		Thread.sleep(3000);
		//Enters flat no.
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_flat_no")).sendKeys("enterTheLandmark");
		Thread.sleep(3000);
		System.out.println("flat no entered successfully");

		//press android back button for hiding keyboard
		driver.navigate().back();
		Thread.sleep(3000);
		//Click on add address button
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/add_address_submit_button")).click();
		System.out.println("address added successfully");
	}

>>>>>>> 386448845b3f1f7ff060eedd9b8e95320c367906
}