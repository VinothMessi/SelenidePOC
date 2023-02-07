package org.sample.designpattern.orangehrm.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;

public interface DashboardElements {
    SelenideElement Heading = $(byTagAndText("h6", "Dashboard"));
    SelenideElement ProfilePic = $(".oxd-userdropdown-img");
    SelenideElement Logout = $(withText("Logout"));
}