package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.ilcarro.pages.BasePage.driver;


public class HomePageSteps {


    @Given("User launches ChromeBrowser")
    public void  launches_ChromeBrowser(){
        new HomePage(driver).launchBrowser();
    }

    @When("User opens ilcarro Home page")
    public void opens_ilcarro_HomePage(){
        new HomePage(driver).openUrl();
    }

    @Then("User verifies Home Page title is displayed")
    public void verifies_HomePage_title(){
        new HomePage(driver).isHomePageTitleDisplayed();
    }

    @And("User quites browser")
    public void quites_browser(){
        new HomePage(driver).quit();
    }
}
