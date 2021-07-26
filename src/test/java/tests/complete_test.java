package tests;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
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

public class complete_test {

	static AppiumDriver<MobileElement> driver;  
	@BeforeSuite
	public void setup(){
		try {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability(MobileCapabilityType.NO_RESET, "false");
			caps.setCapability(MobileCapabilityType.FULL_RESET, "false");
			caps.setCapability(MobileCapabilityType.DEVICE_NAME, "ASUS_X00TD");
			caps.setCapability(MobileCapabilityType.UDID, "J9AAGF00Z133AVP");
			caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			caps.setCapability(MobileCapabilityType.PLATFORM_VERSION, "9");
			caps.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "70");

			caps.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.gobillion.android.commerce.dev");
			caps.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.gobillion.android.commerce.MainActivity");


			URL url = new URL("http://0.0.0.0:4723/wd/hub");

			driver = new AppiumDriver<MobileElement>(url, caps);
			//	driver = new AndroidDriver<MobileElement>(url, caps);
			//	driver = new IOSDriver<MobileElement>(url, caps);
			System.out.println("App Opened");
			Thread.sleep(5000);

		} catch (Exception exp) {
			// TODO Auto-generated catch block
			System.out.println("Cause is:"+exp.getCause());
			System.out.println("Message is:"+exp.getMessage());
			exp.printStackTrace();
		}

	}


	// Login into the App
	public class completeTest {

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
			//press android back button for hiding keyboard
			driver.navigate().back();
			Thread.sleep(3000);


		//	TouchAction touch = new TouchAction(driver);
		Utilities utilObj = new Utilities();

		//Search button to be clicked

		utilObj.clickCheck("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView", "Search");

		//Product to be searched
		utilObj.sendKeywords("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.SearchView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");

		utilObj.clickCheck("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]", "Product");

		//press android back button for hiding keyboard
		driver.navigate().back();
		Thread.sleep(3000);

		driver.navigate().back();
		Thread.sleep(3000);

		System.out.println("Product search test completed.");


		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[4]/android.widget.ImageView")).click();
		System.out.println("Opened food and beverage");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.ImageView")).click();
		System.out.println("Ghee & Oil clicked");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[4]/android.view.ViewGroup")).click();
		System.out.println("Pure and sure Organic clicked");
		Thread.sleep(3000);

		for (int i = 1;i<3;i++){
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageButton[2]")).click();
			System.out.println("Quantity Added"+" "+i);
			Thread.sleep(3000);
		}

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")).click();
		System.out.println("Product Added To Cart");
		Thread.sleep(3000);

		//Make payment from Cart
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/image_btn_layout")).click();
		System.out.println("cart opened");
		Thread.sleep(3000);

		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/my_cart_place_order_button")).click();
		System.out.println("proceed to payment");
		Thread.sleep(3000);

		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/payment_option_pay_on_delivery")).click();
		System.out.println("Pay on Delivery");
		Thread.sleep(3000);

		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/cart_checkout_place_order_button")).click();
		System.out.println("Place Order");
		Thread.sleep(3000);



		System.out.println("Deal Initiation Complete");

		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/cart_success_my_orders_btn")).click();
		System.out.println("Next order from cart");
		Thread.sleep(3000);


		System.out.println("EUREKA");
		driver.close();




		//Make payment from Cart
		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/image_btn_layout")).click();
		System.out.println("cart opened");
		Thread.sleep(3000);

		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/my_cart_place_order_button")).click();
		System.out.println("proceed to payment");
		Thread.sleep(3000);

		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/payment_option_pay_on_delivery")).click();
		System.out.println("Pay on Delivery");
		Thread.sleep(3000);

		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/cart_checkout_place_order_button")).click();
		System.out.println("Place Order");
		Thread.sleep(3000);



		System.out.println("Deal Initiation Complete");

		driver.findElement(By.id("com.gobillion.android.commerce.dev:id/cart_success_my_orders_btn")).click();
		System.out.println("Go to my orders");
		Thread.sleep(3000);
		//press android back button for hiding keyboard
		driver.navigate().back();
		Thread.sleep(3000);

		System.out.println("EUREKA");
		driver.close();



		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView[2]")).click();
		System.out.println("Opened See All");
		Thread.sleep(5000);

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]")).click();
		System.out.println("Sundrop Super clicked");
		Thread.sleep(5000);

		for (int i = 1;i<3;i++){
			driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageButton[2]")).click();
			System.out.println("Quantity Added"+" "+i);
			Thread.sleep(3000);
		}

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.widget.LinearLayout/android.widget.TextView")).click();
		System.out.println("Buy Together clicked");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
		System.out.println("Continue");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ScrollView/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.RadioGroup/android.widget.RadioButton[4]")).click();
		System.out.println("Pay on Delivery");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.Button")).click();
		System.out.println("Continue");
		Thread.sleep(6000);

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout")).click();
		System.out.println("share on whatsapp");
		Thread.sleep(6000);

		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Search']")).click();
		System.out.println("Whatsapp Search Enabled");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")).sendKeys("+916001600256");
		System.out.println("Contact Searched");
		Thread.sleep(3000);

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[2]/android.widget.ListView/android.widget.RelativeLayout")).click();
		System.out.println("Contact selected");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Send']")).click();
		System.out.println("Contact opened");
		Thread.sleep(7000);


		driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc='Send']")).click();
		System.out.println("Deal Shared");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//android.widget.LinearLayout[@content-desc='Navigate up']")).click();
		System.out.println("Back to contact list");
		Thread.sleep(5000);

		System.out.println("Deal Initiation Complete");




		System.out.println("EUREKA");
		driver.close();

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


