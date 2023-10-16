package com.ilcarro.stepDefinitions;

import com.ilcarro.pages.HomePage;
import com.ilcarro.pages.LetTheCarWorkPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ilcarro.pages.BasePage.driver;

public class LetCarWorkSteps {

    @And("User clicks on Let the car work link")
    public void click_Let_the_car_work_link(){new HomePage(driver).clickLetTheCarWorkLink();
    }

    @And("User fills out the form")
    public void fill_out_the_form(){
        new LetTheCarWorkPage(driver)
                .enterLocation("Berlin")
                .enterManufacture("AUDI")
                .enterModel("Q5")
                .enterYear("2020")
                .selectFuel("Diesel")
                .enterSeats("5")
                .enterCarClass("SUV")
                .enterCarRegistrationNumber("BTX7007")
                .enterPrice("100");
    }

    @And("User clicks on the button Submit")
    public void click_on_the_button_Submit() {
        new LetTheCarWorkPage(driver).clickOnSubmit();
    }

    @Then("User verifies car added for rent")
    public void verify_car_added_for_rent(){
        new LetTheCarWorkPage(driver).verifyCarAdded();
    }


}
