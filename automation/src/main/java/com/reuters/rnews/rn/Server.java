package com.reuters.rnews.rn;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class Server {
	public static AndroidDriver<WebElement> driver;
	
	public static void main(String[] args) throws MalformedURLException {
		
		AppiumDriverLocalService service = AppiumDriverLocalService.buildDefaultService();
        service.start();
		
		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID );
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "5.1");
		cap.setCapability("deviceName", "Nexus_5_Test");
		cap.setCapability("app", "/Users/sandramercado/Desktop/app-debug.apk");
		//cap.setCapability("appPackage", "com.thomsonreuters.reuters");
		cap.setCapability(AndroidMobileCapabilityType.APP_WAIT_ACTIVITY, "com.thomsonreuters.reuters.*");
		//cap.setCapability("appActivity", "com.thomsonreuters.reuters.activities.HomePageActivity");
	    //driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), cap);
	    //System.out.println("test");
	    driver = new AndroidDriver<>(service.getUrl(), cap);

	}

}
