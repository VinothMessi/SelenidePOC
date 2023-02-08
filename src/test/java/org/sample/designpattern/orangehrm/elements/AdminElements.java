package org.sample.designpattern.orangehrm.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public interface AdminElements {
    SelenideElement Heading = $(byTagAndText("h6", "Admin"));
    SelenideElement AddUsers = $(byXpath("//button[text()=' Add ']"));
}