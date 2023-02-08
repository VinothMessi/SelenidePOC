package org.sample.designpattern.orangehrm.elements.admin;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public interface AddUserElements {
    SelenideElement Heading = $(byTagAndText("h6", "Add User"));
    SelenideElement UserRole = $(byXpath("//label[text()='User Role']/parent::div/following-sibling::div"));
    SelenideElement Status = $(byXpath("//label[text()='Status']/parent::div/following-sibling::div"));
    SelenideElement EmployeeName = $(byXpath("//input[@placeholder='Type for hints...']"));
    SelenideElement Username = $(byXpath("//label[text()='Username']/parent::div/following-sibling::div/input"));
    SelenideElement Password = $(byXpath("//label[text()='Password']/parent::div/following-sibling::div/input"));
    SelenideElement ConfirmPassword = $(byXpath("//label[text()='Confirm Password']/parent::div/following-sibling::div/input"));
    SelenideElement Save = $(byAttribute("type", "submit"));
}