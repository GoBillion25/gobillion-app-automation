package Tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseClass {

	static AppiumDriver<MobileElement> driver;  
	@BeforeSuite
	public void setup(){
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.NO_RESET, "true");
			caps.setCapability(MobileCapabilityType.FULL_RESET, "false");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Aanwar Ibne Selim");
			caps.setCapability(MobileCapabilityType.UDID, "93e0fdbc");
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "70");

			caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.gobillion.android.commerce.dev");
			caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.gobillion.android.commerce.MainActivity");


			URL url = new URL("http://127.0.0.1:4729/wd/hub");

			driver = new AppiumDriver<MobileElement>(url, caps);
			//	driver = new AndroidDriver<MobileElement>(url, caps);
			//	driver = new IOSDriver<MobileElement>(url, caps);
			System.out.println("App Opened");
			Thread.sleep(8000);

		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println("Cause is:"+exp.getCause());
			System.out.println("Message is:"+exp.getMessage());
			exp.printStackTrace();
		}

	}

	@AfterSuite
	public void teardown(){
		
		if (driver != null){
			driver.close();
		driver.quit();
		}
		else{
			System.out.println("Driver is null "+driver);
		}
	}

}
