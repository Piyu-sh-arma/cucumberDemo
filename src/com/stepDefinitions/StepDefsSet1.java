package com.stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;


public class StepDefsSet1 {
    Scenario scenario;

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("*************Before Scenario******************");
        this.scenario = scenario;
    }

    @Given("Application {fieldType} is launched")
    public void LaunchApplication(String url) {
        scenario.log("Application Launched : " + url);
        scenario.attach("Application Launched : " + url, "text/html", "Step1");
    }

    @When("User enters {fieldType} ,{fieldType}")
    public void userEntersSC_UsernameSC_Pwd(String arg0, String arg1) {
        scenario.attach("Entered " + arg0 + "," + arg1, "text/html", "Step2");
    }

}
