package org.sample.designpattern.orangehrm.elements;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public interface SideNavigationElements {
    SelenideElement Search = $(".oxd-main-menu-search input");
    SelenideElement Admin = $(withText("Admin")).ancestor("li");
    SelenideElement PIM = $(withText("PIM")).ancestor("li");
    SelenideElement Leave = $(withText("Leave")).ancestor("li");
    SelenideElement Time = $(withText("Time")).ancestor("li");
    SelenideElement Recruitment = $(withText("Recruitment")).ancestor("li");
    SelenideElement MyInfo = $(withText("MyInfo")).ancestor("li");
    SelenideElement Performance = $(withText("Performance")).ancestor("li");
    SelenideElement Dashboard = $(withText("Dashboard")).ancestor("li");
    SelenideElement Directory = $(withText("Directory")).ancestor("li");
    SelenideElement Maintenance = $(withText("Maintenance")).ancestor("li");
    SelenideElement Buzz = $(withText("Buzz")).ancestor("li");
}