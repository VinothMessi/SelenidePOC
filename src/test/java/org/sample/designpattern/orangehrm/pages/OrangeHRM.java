package org.sample.designpattern.orangehrm.pages;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.open;

public class OrangeHRM {
    public Login openApplication(String url) {
        open(url);
        return Selenide.page(Login.class);
    }
}