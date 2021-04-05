package com.rajesh.automationframework.pageObjects;

import com.rajesh.automationframework.core.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightPage extends TestBase {

    @FindBy(xpath="//*[@class='chNavText darkGreyText']")
    WebElement flightTab;

    @FindBy(xpath="//*[@class='tabsCircle appendRight5'][contains(.,'Oneway')]")
    WebElement oneWayButton;

    @FindBy(xpath="//*[@placeholder='From']")
    WebElement fromCity;

    @FindBy(xpath="//*[@placeholder='To']")
    WebElement toCity;

    @FindBy(xpath="//*[contains(@class,'primaryBtn')][contains(text(),'Search')]")
    WebElement searchButton;


    public FlightPage() {
        PageFactory.initElements(driver, this);
    }

public String verifyFlightPageTitle(){

        return driver.getTitle();
}

public void isFlightPageDisplayed(){

       flightTab.click();
    }


}
