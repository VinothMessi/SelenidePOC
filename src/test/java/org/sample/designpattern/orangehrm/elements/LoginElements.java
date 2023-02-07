package org.sample.designpattern.orangehrm.elements;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.sample.designpattern.orangehrm.pages.Dashboard;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byAttribute;
import static com.codeborne.selenide.Selenide.$;

public interface LoginElements {
    SelenideElement Image = $(".orangehrm-login-branding img");
    SelenideElement Username = $(byAttribute("name", "username"));
    SelenideElement Password = $(byAttribute("name", "password"));
    SelenideElement Login = $(".oxd-form-actions.orangehrm-login-action button");
    SelenideElement ForgotPassword = $(".orangehrm-login-forgot p");
}