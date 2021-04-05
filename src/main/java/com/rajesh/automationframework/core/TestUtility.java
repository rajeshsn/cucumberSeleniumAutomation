package com.rajesh.automationframework.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class  TestUtility extends TestBase {

    int IMPLICIT_WAIT = 20;

    //Explicit Fluent Wait
    public static Wait<WebDriver> explicitWait() {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(60, TimeUnit.SECONDS).pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
        return wait;
    }

    //
    public static WebElement getWebElement(By by){
       return explicitWait().until(ExpectedConditions.presenceOfElementLocated(by));

    }

    //Select Drop-down value
    public static void selectValueFromDropDown(WebElement ele, String value) {
        Select selectValue = new Select(ele);
        selectValue.selectByVisibleText(value);
    }

    public static void datePicker(WebElement calendar, String year, String monthName, String day, WebDriver driver) {

        calendar.click();

        //Get Desired Year
        String currentYear = driver.findElement(By.xpath("//*[@class='DayPicker-Caption']/div/span")).getText();
        if (!currentYear.equals(year)) {

            do {
                driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
            } while (driver.findElement(By.xpath("//*[@class='DayPicker-Caption']/div/span")).getText().equals(year));
        }
//Get Desired month

        List<WebElement> currentMonth = driver.findElements(By.xpath("//div[@class='DayPicker-Caption']/div"));
        ListIterator<WebElement> itr2 = currentMonth.listIterator();
        while (itr2.hasNext()) {

            System.out.println("current months" + itr2.next().getText());
        }
        for (int i = 0; i <= currentMonth.size(); i++) {
            WebElement ele1 = currentMonth.get(i);
            String MonthText = ele1.getText();

            if (!currentMonth.equals(monthName)) {

                do {
                    driver.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
                } while (driver.findElement(By.xpath("//div[@class='DayPicker-Caption']/div")).getText().equals(monthName));
            }
        }

        //Get  date for desired month
        List<WebElement> allDateOfDesiredMonth = driver.findElements(By.xpath("//div[@class='DayPicker-Week']/div/div/p"));
        for (WebElement d : allDateOfDesiredMonth) {
            if (d.getText().trim().equals(day)) {
                d.click();
                break;
            }

        }

    }
}

