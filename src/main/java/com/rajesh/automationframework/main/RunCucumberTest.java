package com.rajesh.automationframework.main;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(tags={"@FlightTests"},
        glue ={"com.rajesh.automationframework.stepDefinitions"},
        features={"C:\\Users\\Rajesh\\Documents\\AutomationTesting\\Idea-Project\\SeleniumCucumberAutomationFramewok\\src\\main\\resources\\features"},
        plugin = {"html:Results/TestOutput.html"}


)
public class RunCucumberTest {
}
