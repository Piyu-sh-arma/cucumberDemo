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
        this.scenario = scenario;
    }

    @Given("Application {fieldType} is launched")
    public void LaunchApplication(String url) {
        scenario.log("Application Launched : " + url);
    }

    @When("User enters {fieldType} ,{fieldType}")
    public void userEntersSC_UsernameSC_Pwd(String arg0, String arg1) {
        scenario.log("Entered UserName : " + arg0 + ", Password : " + arg1);
    }

    @Given("Data setup is done properly")
    public void dataSetupIsDoneProperly() {
        scenario.log("Setup done");
    }

    @Then("fetch data map for {mapType}")
    public void fetchDataMapForUsecase(Map<String, String> map) {
        scenario.log("Fetched ");
    }
}
