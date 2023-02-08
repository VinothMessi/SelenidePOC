package org.sample.designpattern.orangehrm.pages;

import com.codeborne.selenide.Selenide;
import org.sample.designpattern.orangehrm.elements.AddUserElements;
import org.sample.designpattern.orangehrm.elements.SideNavigationElements;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AddUser implements AddUserElements, SideNavigationElements {
    public AddUser hasItLoaded() {
        Heading.shouldBe(visible).shouldHave(appear);
        return this;
    }

    public AddUser fill(String name, String username, String password) {
        EmployeeName.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(name);
        Username.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(username);
        Password.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(password);
        ConfirmPassword.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(password);
        return this;
    }

    public AddUser setRoleAs(String role) {
        UserRole.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        $(withText(role)).shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        return this;
    }

    public AddUser setStatusAs(String status) {
        Status.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        $(withText(status)).shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        return this;
    }

    public void save() {
        Save.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
    }

    public Dashboard goToDashboard() {
        Dashboard.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        return Selenide.page(Dashboard.class);
    }
}