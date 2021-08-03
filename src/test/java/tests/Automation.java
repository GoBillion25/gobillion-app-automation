package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Automation extends BaseClass{
/*Team Buy Journey*/
	/*@Test 
	public void teamBuy () throws Exception{

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

		driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.FrameLayout/androidx.appcompat.widget.LinearLayoutCompat/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText")).sendKeys("+917005685825");
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


	}*/

	
	@Test
	public void productDetailsPage() throws Exception{

	//	TouchAction touch = new TouchAction(driver);
		Utilities utilObj = new Utilities();
		
		//Search button to be clicked
		
		utilObj.clickCheck("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView", "Search");
		
		//Product to be searched
		utilObj.sendKeywords("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.SearchView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");

		utilObj.clickCheck("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]", "Product");

//
//		MobileElement discountPrice = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[3]"));
//		if ((discountPrice.getText().toLowerCase().contains("₹")) && (discountPrice.isDisplayed() == true)){
//			System.out.println("Discount Price is OK: Test Passed");
//			Thread.sleep(3000);
//		}
//
//		MobileElement MRText = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[4]"));
//		if ((MRText.getText().toLowerCase().contains("m.r.p:") || MRText.getText().toLowerCase().contains("mrp:")) && (MRText.isDisplayed() == true)){
//			System.out.println("M.R.P. text is OK: Test Passed");
//			Thread.sleep(3000);
//		}
//
//		MobileElement MRPrice = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[5]"));
//		if ((MRPrice.getText().toLowerCase().contains("₹")) && (MRPrice.isDisplayed() == true)){
//			System.out.println("M.R.P. is OK: Test Passed");
//			Thread.sleep(3000);
//		}
//
//		MobileElement quantity = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView"));
//		if ((quantity.getText().toLowerCase().contains("quantity:")) && (quantity.isDisplayed() == true)){
//			System.out.println("Quantity text is OK: Test Passed");
//			Thread.sleep(3000);
//		}
//
//		MobileElement discountPercent = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView"));
//		if ((discountPercent.getText().toLowerCase().contains("% off:")) && (discountPercent.isDisplayed() == true)){
//			System.out.println("Discount Percent is OK: Test Passed");
//			Thread.sleep(3000);
//		}
//
//		MobileElement quantityMinus = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageButton[1]"));
//		MobileElement quantityPlus = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageButton[2]"));
//		MobileElement quantityNumber = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView"));
//		if (quantityMinus.isEnabled() == true && quantityMinus.isDisplayed() == true
//				&& quantityPlus.isEnabled() == true && quantityPlus.isDisplayed() == true
//				&& quantityNumber.isEnabled() == true && quantityNumber.isDisplayed() == true){
//
//			System.out.println("Quantity + and - Buttons are working and number is displayed: Test Passed");
//			Thread.sleep(3000);
//		}
//
//		MobileElement deliveryEstimateText = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView[2]"));
//		if ((deliveryEstimateText.getText().toLowerCase().contains("check the estimated date of delivery")) && (deliveryEstimateText.isDisplayed() == true)){
//			System.out.println("Delivery Estimate text is OK: Test Passed");
//			Thread.sleep(3000);
//		}
//
//		MobileElement deliveryText = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView"));
//		if ((deliveryText.getText().toLowerCase().contains("delivery:")) && (deliveryText.isDisplayed() == true)){
//			System.out.println("Delivery text is OK: Test Passed");
//			Thread.sleep(3000);
//		}
//
//		MobileElement pinCodeField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.EditText"));
//		if ((pinCodeField.getText().toLowerCase().contains("enter your pincode")) && (pinCodeField.isDisplayed() == true) && (pinCodeField.isEnabled() == true)){
//
//			System.out.println("Pincode field is active and editable");
//			pinCodeField.click();
//			pinCodeField.sendKeys("78011192");
//			Thread.sleep(3000);
//			MobileElement checkButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView"));
//			if ((checkButton.getText().toLowerCase().contains("check")) && (checkButton.isDisplayed() == true) && (checkButton.isEnabled() == true)){
//				System.out.println("Check Button is OK: Test Passed");
//				Thread.sleep(3000);
//				checkButton.click();
//			/*	touch.press(PointOption.point(600,1300))
//				.waitAction(WaitOptions.waitOptions(Duration.ofSeconds(2)))
//				.moveTo(PointOption.point(600, 300));
//				Thread.sleep(3000);*/
//				if ("A" == "A"){
//					System.out.println("Pincode is servicable");		
//				}
//				else if ("sorry" == "sorry"){
//					System.out.println("Pincode is inserviceable or is invalid");
//					pinCodeField.clear();
//					pinCodeField.sendKeys("781038");
//					checkButton.click();
//					if ("A" == "A"){
//						System.out.println("Pincode is serviceable and message is displayed");
//					}
//				}
//
//			}
//		}

		System.out.println("EUREKA");
		driver.close();

	}
}
