package com.Mobile_Test.StepDefinition;

import com.google.gson.Gson;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class AppiumDriverSetup {

    @Test
    public void Driver() throws MalformedURLException {

        DesiredCapabilities caps=new DesiredCapabilities();
       // caps.setCapability("deviceName","Pixel 2");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
        caps.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        caps.setCapability(MobileCapabilityType.VERSION,"10.0");
        caps.setCapability(MobileCapabilityType.APP,"https://cybertek-appium.s3.amazonaws.com/calculator.apk");


        URL url =new URL("http://localhost:4723/wd/hub");

        AppiumDriver<MobileElement> driverMob=new AndroidDriver<MobileElement>(url,caps);


        System.out.println("driverMob.getDeviceTime() = " + driverMob.getDeviceTime());


        MobileElement elements = driverMob.findElement(MobileBy.AccessibilityId("square root"));

        elements.click();





    }


}
