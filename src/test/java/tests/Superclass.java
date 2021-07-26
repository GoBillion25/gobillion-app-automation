package tests;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.TestNG;
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


public class Superclass {


	public static void main(String[] args)
	{
		TestNG objTNG = new TestNG();

		List<String> suites = new ArrayList<String>();
		//Baseclass
		suites.add("C:\\Users\\hp\\eclipse-workspace\\appiumtests\\testngBaseClass.xml");
		//logout test
		suites.add("C:\\Users\\hp\\eclipse-workspace\\appiumtests\\testngLogOut.xml");
		//login test	
		suites.add("C:\\Users\\hp\\eclipse-workspace\\appiumtests\\testnglogin.xml");
		//add address	
		suites.add("C:\\Users\\hp\\eclipse-workspace\\appiumtests\\testngAddress.xml");
		//search_for_product
		suites.add("C:\\Users\\hp\\eclipse-workspace\\appiumtests\\testngSearchForProduct.xml");
		//product details
		suites.add("C:\\Users\\hp\\eclipse-workspace\\appiumtests\\testngProdDetails.xml");
		//individual buy
		suites.add("C:\\Users\\hp\\eclipse-workspace\\appiumtests\\testngIndividualBuy.xml");
		//payment from cart
		suites.add("C:\\Users\\hp\\eclipse-workspace\\appiumtests\\testngPaymentFromCart.xml");
		//teambuy
		suites.add("C:\\Users\\hp\\eclipse-workspace\\appiumtests\\testngTeamBuy.xml");



		objTNG.setTestSuites(suites);


		objTNG.run();
		

	}





	
}
