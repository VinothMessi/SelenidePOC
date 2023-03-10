package org.sample.designpattern.orangehrm.pages;

import com.codeborne.selenide.Selenide;
import org.sample.designpattern.orangehrm.elements.DashboardElements;
import org.sample.designpattern.orangehrm.elements.SideNavigationElements;
import org.sample.designpattern.orangehrm.pages.admin.Admin;
import org.sample.designpattern.orangehrm.pages.pim.PIM;
import org.sample.designpattern.orangehrm.pages.recruitment.Recruitment;

import static com.codeborne.selenide.Condition.*;

public class Dashboard implements DashboardElements, SideNavigationElements {
    public Dashboard hasItLoaded() {
        Heading.shouldBe(visible).shouldHave(appear);
        ProfilePic.shouldBe(visible).shouldBe(enabled).shouldHave(appear);
        return this;
    }

    public Admin openAdmin() {
        Search.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue("Admin");
        Admin.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        return Selenide.page(Admin.class);
    }

    public PIM openPIM() {
        Search.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue("PIM");
        PIM.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        return Selenide.page(PIM.class);
    }

    public Recruitment openRecruitment() {
        Search.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue("Recruitment");
        Recruitment.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        return Selenide.page(Recruitment.class);
    }

    public Login logOut() {
        ProfilePic.click();
        Logout.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        return Selenide.page(Login.class);
    }
}