package com.rajesh.automationframework.stepDefinitions;

import com.rajesh.automationframework.core.TestBase;
import com.rajesh.automationframework.core.TestUtility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import com.rajesh.automationframework.pageObjects.FlightPage;

import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class FlightPageStepDefTest extends TestBase {
    @Given("flightpage is displayed")
    public void flightpageIsDisplayed() {
        TestBase.setup();
        driver.findElement(By.xpath("//*[@class='chNavText darkGreyText']")).click();
    }

    @When("I click on oneway radio button")
    public void iClickOnOnewayRadioButton() {

      WebElement oneClick= TestUtility.explicitWait().until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='makeFlex']/ul/li[1][contains(text(),'Oneway')]")));
       oneClick.click();
    }

    @When("I selected fromCity from dropdown")
    public void iSelectedFromCityFromDropdown() {
      WebElement fromCity =TestUtility.explicitWait().until(ExpectedConditions.presenceOfElementLocated(By.id("fromCity")));
      fromCity.click();
      driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        List<WebElement> fromCities = driver.findElements(By.xpath("//li[@class='react-autosuggest__suggestion']/div/div[1]/p[1]"));
        System.out.println(fromCities.size() +"\n");
        ListIterator<WebElement> itr =fromCities.listIterator();
        while(itr.hasNext()){
            System.out.println("Next " + itr.next().getText() );
        }
        for(int i=0;i<fromCities.size();i++){
            WebElement element=fromCities.get(i);
           String text= element.getText();
            if(text.contentEquals("Pune, India" )){
                element.click();
                break;
            }
            System.out.println("Values in list " +text);
        }
    }

    @When("I selected Tocity from dropdown")
    public void iSelectedTocityFromDropdown() throws InterruptedException {
       // WebElement toCity1 =TestUtility.explicitWait().until(ExpectedConditions.presenceOfElementLocated(By.id("toCity")));
        TestUtility.getWebElement(By.id("toCity")).click();

       // toCity1.clear();
       // TestUtility.getWebElement(By.xpath("//div[@role='combobox']//input")).sendKeys("DEL");
       TestUtility.getWebElement(By.xpath("//*[@id=\"react-autowhatever-1-section-0-item-0\"]/div/div[1]/p[1]")).click();
        /*//toCity1.sendKeys(Keys.TAB);
        //toCity1.sendKeys("Delhi,India");
        //driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        Thread.sleep(10000);
        List<WebElement> toCities = driver.findElements(By.xpath("//li[@class='react-autosuggest__suggestion']/div/div[1]/p[1]"));
        System.out.println(toCities.size() +"\n");
        ListIterator<WebElement> itr1 =toCities.listIterator();
        while(itr1.hasNext()){
            System.out.println("Next " + itr1.next().getText() );
        }
        for(int j=0;j<toCities.size();j++){
            WebElement element1=toCities.get(j);
            String text1= element1.getText();
            if(text1.contentEquals("Delhi, India")){
                element1.click();
                break;
            }
            System.out.println("Values in list " +text1);
        }*/
    }

    @When("I selected departure date from dropdown")
    public void iSelectedDepartureDateFromDropdown() {

        WebElement departure = driver.findElement(By.xpath("//span[@class='lbl_input latoBold appendBottom10'] [contains(text(),'DEPARTURE')]"));
        TestUtility.datePicker(departure,"2019","November","15",driver);
    }

    @When("I clicked on search button")
    public void iClickedOnSearchButton() {
    }

    @Then("I should be displayed the flight details of selected date")
    public void iShouldBeDisplayedTheFlightDetailsOfSelectedDate() {
    }



}
