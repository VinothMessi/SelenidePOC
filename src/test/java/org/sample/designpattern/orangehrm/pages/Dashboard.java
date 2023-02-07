package org.sample.designpattern.orangehrm.pages;

import com.codeborne.selenide.Selenide;
import org.sample.designpattern.orangehrm.elements.DashboardElements;
import org.sample.designpattern.orangehrm.elements.SideNavigationElements;

import static com.codeborne.selenide.Condition.*;

public class Dashboard implements DashboardElements, SideNavigationElements {
    public org.sample.designpattern.orangehrm.pages.Dashboard hasItLoaded() {
        Heading.shouldBe(visible).shouldHave(appear);
        ProfilePic.shouldBe(visible).shouldBe(enabled).shouldHave(appear);
        return this;
    }

    public PIM openPIM() {
        Search.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue("PIM");
        PIM.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        return Selenide.page(PIM.class);
    }

    public Login logOut() {
        ProfilePic.click();
        Logout.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        return Selenide.page(Login.class);
    }
}