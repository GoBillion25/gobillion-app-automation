package Tests;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;import org.openqa.selenium.UnsupportedCommandException;

import io.appium.java_client.MobileElement;


public class Utilities extends BaseClass{
	

	public void clickCheck(String xpath,String elementName) throws Exception {
		MobileElement result = BaseClass.driver.findElement(By.xpath(xpath));
		if (result != null){
			result.click();		

			//		BaseClass.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")).click();
			System.out.println(elementName + " Clicked");
			try{ 
				Thread.sleep(4000);
			} catch (Exception e){
				System.out.println("Cause is:"+e.getCause());
				System.out.println("Message is:"+e.getMessage());
				e.printStackTrace();
			}
		}
		else {
			System.out.println(elementName+" Button Not Found");
		}
	}

	public void sendKeywords(String xpath) throws Exception {
		try {

			MobileElement result = BaseClass.driver.findElement(By.xpath(xpath));
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Input");
			String userInput = sc.nextLine();
			sc.close();
			result.sendKeys(userInput);		

			//		BaseClass.driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.view.ViewGroup/android.widget.TextView")).click();
			System.out.println(userInput + " Entered");
			Thread.sleep(4000);
		} catch (NoSuchElementException elemental) {
			// TODO: handle exception
			System.out.println("xpath not found");
		} catch (Exception e){
			System.out.println("Cause is:"+e.getCause());
			System.out.println("Message is:"+e.getMessage());
			e.printStackTrace();
		} 


	}
}
