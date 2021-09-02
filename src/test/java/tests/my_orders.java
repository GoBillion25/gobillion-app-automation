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

public class my_orders extends BaseClass{

	@Test
	public void MyOrders() throws Exception{
		//click My Orders
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/nav_group_buy")).click();
		Thread.sleep(3000);
		System.out.println("Opened My Orders and Team Buy");

		//click active deals
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/active_deal_button")).click();
		Thread.sleep(3000);
		System.out.println("CLicked active deals");
		
		//click for viewing Details
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")).click();
		Thread.sleep(3000);
		System.out.println("Order details is displayed");

		//Enters item details
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/item_count")).click();
		Thread.sleep(3000);
		System.out.println("items page is displayed");
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		System.out.println("returned to homepage");
		
		//click My Orders
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/nav_group_buy")).click();
		Thread.sleep(3000);
		System.out.println("Opened My Orders and Team Buy");

		//click Individual Buy
		driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc=\"Individual Buy\"]")).click();
		Thread.sleep(3000);
		System.out.println("CLicked Individual buy");

		//Click for card info
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/androidx.viewpager.widget.ViewPager/android.view.ViewGroup/android.widget.ScrollView/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.cardview.widget.CardView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView[2]")).click();
		Thread.sleep(3000);
		System.out.println("CLicked for info");

		//Enters item details
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/item_count")).click();
		Thread.sleep(3000);
		System.out.println("items page is displayed");
		driver.navigate().back();
		Thread.sleep(3000);
		//press android back button 
		driver.navigate().back();
		Thread.sleep(3000);
		//press android back button
		driver.navigate().back();
		Thread.sleep(3000);

		System.out.println("My orders check successful");
	}

}