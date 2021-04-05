package com.rajesh.automationframework.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SearchStep {
    @Given("I am on google home page")
    public void iAmOnGoogleHomePage() {
        try {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", "chrome");
            capabilities.setCapability("browserName", "chrome");
            capabilities.setCapability("platformName", "Android");
         //   capabilities.setCapability("platformVersion", "9.0");
            capabilities.setCapability("deviceName", "platformName");
            URL url = new URL("http://localhost:4723/wd/hub");
            WebDriver driver = new RemoteWebDriver(url, capabilities);
            driver.get("https://www.google.com");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
