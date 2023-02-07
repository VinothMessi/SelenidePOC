package org.sample.designpattern.orangehrm.pages;

import com.codeborne.selenide.Selenide;
import org.sample.designpattern.orangehrm.elements.LoginElements;

import static com.codeborne.selenide.Condition.*;

public class Login implements LoginElements {
    public org.sample.designpattern.orangehrm.pages.Login hasItLoaded() {
        Image.shouldBe(visible).shouldHave(appear);
        ForgotPassword.shouldBe(visible).shouldBe(enabled).shouldHave(appear);
        return this;
    }

    public Dashboard loginAs(String username, String password) {
        Username.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(username);
        Password.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(password);
        Login.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        return Selenide.page(Dashboard.class);
    }
}