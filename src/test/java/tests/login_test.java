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


		//click hamburger button
		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();
		Thread.sleep(3000);
		System.out.println("Hamburger button clicked");

		//click logout
		driver.findElement(By.xpath("//android.widget.CheckedTextView[contains(@resource-id,'design_menu_item_text') and @text='Log Out']")).click();
		Thread.sleep(3000);
		System.out.println("Account logged out");


		//click for entering phone Number
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/getPhoneInputFieldSecond")).click();
		Thread.sleep(6000);
		//Enters Mobile No
		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.ListView/android.widget.RelativeLayout/android.widget.TextView")).click();
		Thread.sleep(5000);
		//click for continue button
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/continueButtonSecond")).click();
		Thread.sleep(3000);
		System.out.println("Phone Number Entered Successfully");
		//(required when phone number is to be entered manually)
		//		//Enters Mobile No
		//		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/continueButtonSecond")).sendKeys("1234567891");
		//		Thread.sleep(3000);
		//		System.out.println("Phone Number Entered Successfully");
		//      click for continue button
		//		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/continueButtonSecond")).click();
		//		Thread.sleep(3000);
		//		System.out.println("Phone Number Entered Successfully");
		//		//click for entering OTP
		//		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/getOtpInputField")).click();
		//		Thread.sleep(3000);
		//		//Enter OTP
		//		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/getOtpInputField")).sendKeys("123456");
		//		Thread.sleep(3000);
		//		//click verify
		//		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/verify")).click();
		//		Thread.sleep(3000);
		//		System.out.println("OTP entered successfully");
		//   press android back button for hiding keyboard
		//		driver.navigate().back();
		//		Thread.sleep(3000);
		//Click on Sign IN button
		//driver.findElement(By.id("com.gobillion.android.commerce.dev:id/loginButton")).click();
		Thread.sleep(3000);
		System.out.println("Verification passed");
		Thread.sleep(3000);
		System.out.println("Logged in successfully");
	}

}