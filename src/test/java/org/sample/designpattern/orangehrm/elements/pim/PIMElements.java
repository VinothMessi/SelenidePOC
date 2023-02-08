package org.sample.designpattern.orangehrm.elements.pim;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public interface PIMElements {
    SelenideElement Heading = $(byTagAndText("h6", "PIM"));
    SelenideElement AddEmployee = $(byLinkText("Add Employee"));
}