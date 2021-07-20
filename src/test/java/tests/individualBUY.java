package tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class individualBUY extends BaseClass{

	@Test 
	public void individualBuy () throws Exception{

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

	}
}
