package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class payment_from_cart extends BaseClass{

	@Test 
	public void individualBuy () throws Exception{


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


		System.out.println("EUREKA");
		driver.close();

	}
}
