package com.stepDefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import java.util.Map;


public class StepDefsSet2 {
    Scenario scenario;

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("*************Before Scenario******************");
        this.scenario = scenario;
    }

    @Given("Data setup is done properly")
    public void dataSetupIsDoneProperly() {
        scenario.attach("Setup done", "text/html", "Step2");
    }

    @Then("fetch data map for {mapType}")
    public void fetchDataMapForUsecase(Map<String, String> map) {
        scenario.attach("Fetched " + map, "text/html", "Step2");
    }


}
