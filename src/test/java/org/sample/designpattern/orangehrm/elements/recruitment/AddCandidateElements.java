package org.sample.designpattern.orangehrm.elements.recruitment;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public interface AddCandidateElements {
    SelenideElement Heading = $(byTagAndText("h6", "Add Candidate"));
    SelenideElement FirstName = $(byName("firstName"));
    SelenideElement MiddleName = $(byName("middleName"));
    SelenideElement LastName = $(byName("lastName"));

    SelenideElement Vacancy = $(byXpath("//label[text()='Vacancy']/parent::div/following-sibling::div"));
    SelenideElement Email = $(byXpath("//label[text()='Email']/parent::div/following-sibling::div/input"));
    SelenideElement ContactNumber = $(byXpath("//label[text()='Contact Number']/parent::div/following-sibling::div/input"));
    SelenideElement Keywords = $(byXpath("//label[text()='Keywords']/parent::div/following-sibling::div/input"));
    SelenideElement Date = $(byXpath("//label[text()='Date of Application']/parent::div/following-sibling::div//input"));
    SelenideElement Notes = $(byXpath("//label[text()='Notes']/parent::div/following-sibling::div/textarea"));
    SelenideElement Consent = $(".oxd-checkbox-input");
    SelenideElement Save = $(byAttribute("type", "submit"));
}