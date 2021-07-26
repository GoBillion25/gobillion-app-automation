<<<<<<< HEAD
package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class product_details extends BaseClass{


	@Test
	public void productDetailsPage() throws Exception{

		//	TouchAction touch = new TouchAction(driver);
			Utilities utilObj = new Utilities();
			
			//Search button to be clicked
			
			utilObj.clickCheck("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView", "Search");
			
			//Product to be searched
			utilObj.sendKeywords("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.SearchView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");

			utilObj.clickCheck("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]", "Product");

		
			MobileElement discountPrice = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[3]"));
		if ((discountPrice.getText().toLowerCase().contains("₹")) && (discountPrice.isDisplayed() == true)){
			System.out.println("Discount Price is OK: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement MRText = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[4]"));
		if ((MRText.getText().toLowerCase().contains("m.r.p:") || MRText.getText().toLowerCase().contains("mrp:")) && (MRText.isDisplayed() == true)){
			System.out.println("M.R.P. text is OK: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement MRPrice = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[5]"));
		if ((MRPrice.getText().toLowerCase().contains("₹")) && (MRPrice.isDisplayed() == true)){
			System.out.println("M.R.P. is OK: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement quantity = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView"));
		if ((quantity.getText().toLowerCase().contains("quantity:")) && (quantity.isDisplayed() == true)){
			System.out.println("Quantity text is OK: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement discountPercent = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView"));
		if ((discountPercent.getText().toLowerCase().contains("% off:")) && (discountPercent.isDisplayed() == true)){
			System.out.println("Discount Percent is OK: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement quantityMinus = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageButton[1]"));
		MobileElement quantityPlus = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageButton[2]"));
		MobileElement quantityNumber = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView"));
		if (quantityMinus.isEnabled() == true && quantityMinus.isDisplayed() == true
				&& quantityPlus.isEnabled() == true && quantityPlus.isDisplayed() == true
				&& quantityNumber.isEnabled() == true && quantityNumber.isDisplayed() == true){

			System.out.println("Quantity + and - Buttons are working and number is displayed: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement deliveryEstimateText = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView[2]"));
		if ((deliveryEstimateText.getText().toLowerCase().contains("check the estimated date of delivery")) && (deliveryEstimateText.isDisplayed() == true)){
			System.out.println("Delivery Estimate text is OK: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement deliveryText = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView"));
		if ((deliveryText.getText().toLowerCase().contains("delivery:")) && (deliveryText.isDisplayed() == true)){
			System.out.println("Delivery text is OK: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement pinCodeField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.EditText"));
		if ((pinCodeField.getText().toLowerCase().contains("enter your pincode")) && (pinCodeField.isDisplayed() == true) && (pinCodeField.isEnabled() == true)){

			System.out.println("Pincode field is active and editable");
			pinCodeField.click();
			pinCodeField.sendKeys("78011192");
			Thread.sleep(3000);
			MobileElement checkButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView"));
			if ((checkButton.getText().toLowerCase().contains("check")) && (checkButton.isDisplayed() == true) && (checkButton.isEnabled() == true)){
				System.out.println("Check Button is OK: Test Passed");
				Thread.sleep(3000);
				checkButton.click();
				System.out.println("Pincode is servicable");

			}


			System.out.println("EUREKA");
			driver.close();
		}

	}
}
=======
package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class product_details extends BaseClass{


	@Test
	public void productDetailsPage() throws Exception{

		//	TouchAction touch = new TouchAction(driver);
			Utilities utilObj = new Utilities();
			
			//Search button to be clicked
			
			utilObj.clickCheck("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView", "Search");
			
			//Product to be searched
			utilObj.sendKeywords("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/androidx.appcompat.widget.LinearLayoutCompat/android.widget.SearchView/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.EditText");

			utilObj.clickCheck("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]", "Product");

		
			MobileElement discountPrice = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[3]"));
		if ((discountPrice.getText().toLowerCase().contains("₹")) && (discountPrice.isDisplayed() == true)){
			System.out.println("Discount Price is OK: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement MRText = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[4]"));
		if ((MRText.getText().toLowerCase().contains("m.r.p:") || MRText.getText().toLowerCase().contains("mrp:")) && (MRText.isDisplayed() == true)){
			System.out.println("M.R.P. text is OK: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement MRPrice = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[1]/android.widget.TextView[5]"));
		if ((MRPrice.getText().toLowerCase().contains("₹")) && (MRPrice.isDisplayed() == true)){
			System.out.println("M.R.P. is OK: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement quantity = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView"));
		if ((quantity.getText().toLowerCase().contains("quantity:")) && (quantity.isDisplayed() == true)){
			System.out.println("Quantity text is OK: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement discountPercent = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView"));
		if ((discountPercent.getText().toLowerCase().contains("% off:")) && (discountPercent.isDisplayed() == true)){
			System.out.println("Discount Percent is OK: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement quantityMinus = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageButton[1]"));
		MobileElement quantityPlus = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.ImageButton[2]"));
		MobileElement quantityNumber = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup/android.widget.TextView"));
		if (quantityMinus.isEnabled() == true && quantityMinus.isDisplayed() == true
				&& quantityPlus.isEnabled() == true && quantityPlus.isDisplayed() == true
				&& quantityNumber.isEnabled() == true && quantityNumber.isDisplayed() == true){

			System.out.println("Quantity + and - Buttons are working and number is displayed: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement deliveryEstimateText = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.TextView[2]"));
		if ((deliveryEstimateText.getText().toLowerCase().contains("check the estimated date of delivery")) && (deliveryEstimateText.isDisplayed() == true)){
			System.out.println("Delivery Estimate text is OK: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement deliveryText = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.widget.TextView"));
		if ((deliveryText.getText().toLowerCase().contains("delivery:")) && (deliveryText.isDisplayed() == true)){
			System.out.println("Delivery text is OK: Test Passed");
			Thread.sleep(3000);
		}

		MobileElement pinCodeField = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.EditText"));
		if ((pinCodeField.getText().toLowerCase().contains("enter your pincode")) && (pinCodeField.isDisplayed() == true) && (pinCodeField.isEnabled() == true)){

			System.out.println("Pincode field is active and editable");
			pinCodeField.click();
			pinCodeField.sendKeys("78011192");
			Thread.sleep(3000);
			MobileElement checkButton = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.view.ViewGroup/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.ScrollView/android.widget.LinearLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]/android.widget.LinearLayout/android.widget.TextView"));
			if ((checkButton.getText().toLowerCase().contains("check")) && (checkButton.isDisplayed() == true) && (checkButton.isEnabled() == true)){
				System.out.println("Check Button is OK: Test Passed");
				Thread.sleep(3000);
				checkButton.click();
				System.out.println("Pincode is servicable");

			}


			System.out.println("EUREKA");
			driver.close();
		}

	}
}
>>>>>>> 386448845b3f1f7ff060eedd9b8e95320c367906
