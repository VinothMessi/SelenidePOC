package org.sample.designpattern.orangehrm.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public interface AddEmployeeElements {
    SelenideElement Heading = $(byTagAndText("h6", "Add Employee"));
    SelenideElement FirstName = $(byName("firstName"));
    SelenideElement MiddleName = $(byName("middleName"));
    SelenideElement LastName = $(byName("lastName"));
    SelenideElement CreateLoginDetails = $(byTagAndText("p", "Create Login Details")).sibling(0);
    SelenideElement Username = $(byXpath("//label[text()='Username']/parent::div/following-sibling::div/input"));
    SelenideElement Password = $(byXpath("//label[text()='Password']/parent::div/following-sibling::div/input"));
    SelenideElement ConfirmPassword = $(byXpath("//label[text()='Confirm Password']/parent::div/following-sibling::div/input"));
    SelenideElement Save = $(byAttribute("type", "submit"));
}