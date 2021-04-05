package com.rajesh.automationframework.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;

    public static void setup() {
        try {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\Rajesh\\Documents\\AutomationTesting\\Idea-Project\\SeleniumCucumberAutomationFramewok\\src\\main\\resources\\exeServers\\chromedriver.exe");
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("browserName", "chrome");
            driver = new ChromeDriver();
            driver.get("https://www.makemytrip.com");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
