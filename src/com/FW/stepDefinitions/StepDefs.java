package com.FW.stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Map;


public class StepDefs {
    Scenario scenario;

    @Before
    public void beforeScenario(Scenario scenario) {
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

    @Given("Data setup is done properly")
    public void dataSetupIsDoneProperly() {
        scenario.attach("Data is setup properly", "text/html", "Step1");
    }

    @Then("fetch data map for {mapType}")
    public void fetchDataForEXTSCUsername(Map<String, String> scenarioData) {

        scenario.attach("Data Map is " + scenarioData, "text/html", "Step2");
    }

    @Then("fetch data map for {word}")
    public void fetchDataMapForUsecase(String word) {
        scenario.attach("Data Map is " + word, "text/html", "Step2");
    }
}
