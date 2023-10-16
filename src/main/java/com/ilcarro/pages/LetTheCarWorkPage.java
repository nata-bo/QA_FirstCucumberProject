package com.ilcarro.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class LetTheCarWorkPage extends BasePage{
    public LetTheCarWorkPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id="pickUpPlace")
    WebElement location;
    public LetTheCarWorkPage enterLocation(String address) {
       type(location,address);
        return this;
    }

    @FindBy(id = "make")
    WebElement make;
    public LetTheCarWorkPage enterManufacture(String manufacture) {
      type(make,manufacture);
        return this;
    }

    @FindBy(id = "model")
    WebElement carModel;
    public LetTheCarWorkPage enterModel(String model) {
        type(carModel,model);
        return this;
    }

    @FindBy(id ="year")
    WebElement carYear;
    public LetTheCarWorkPage enterYear(String year) {
       type(carYear,year);
        return this;
    }

    @FindBy(id = "fuel")
    WebElement carFuel;

    public LetTheCarWorkPage selectFuel(String fuel) {
        Select select = new Select(carFuel);
        select.selectByVisibleText(fuel);
        return this;
    }

    @FindBy(id = "seats")
    WebElement carSeats;
    public LetTheCarWorkPage enterSeats(String seats) {
         type(carSeats,seats);
        return this;
    }

    @FindBy(id = "class")
    WebElement classCar;
    public LetTheCarWorkPage enterCarClass(String carClass) {
       type(classCar,carClass);
        return this;
    }

    @FindBy(id = "serialNumber")
    WebElement serialNumber;
    public LetTheCarWorkPage enterCarRegistrationNumber(String number) {
         type(serialNumber,number);
        return this;
    }
    @FindBy(id = "price")
    WebElement rentPrice;

    public LetTheCarWorkPage enterPrice(String price) {
        type(rentPrice,price);
        return this;
    }

    @FindBy(xpath = "//button[contains(.,'Submit')]")
    WebElement submit;
    public LetTheCarWorkPage clickOnSubmit() {
        click(submit);
        return this;
    }

    public LetTheCarWorkPage verifyCarAdded() {
       // TODO
        return this;
    }
}
