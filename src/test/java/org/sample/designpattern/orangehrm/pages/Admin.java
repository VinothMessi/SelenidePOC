package org.sample.designpattern.orangehrm.pages;

import com.codeborne.selenide.Selenide;
import org.sample.designpattern.orangehrm.elements.AdminElements;

import static com.codeborne.selenide.Condition.*;

public class Admin implements AdminElements {
    public Admin hasItLoaded() {
        Heading.shouldBe(visible).shouldBe(enabled).shouldHave(appear);
        return this;
    }

    public AddUser addUsers() {
        AddUsers.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        return Selenide.page(AddUser.class);
    }
}