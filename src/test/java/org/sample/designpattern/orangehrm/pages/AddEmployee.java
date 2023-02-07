package org.sample.designpattern.orangehrm.pages;

import com.codeborne.selenide.Selenide;
import org.sample.designpattern.orangehrm.elements.AddEmployeeElements;
import org.sample.designpattern.orangehrm.elements.SideNavigationElements;

import static com.codeborne.selenide.Condition.*;

public class AddEmployee implements AddEmployeeElements, SideNavigationElements {
    public AddEmployee hasItLoaded() {
        Heading.shouldBe(visible).shouldHave(appear);
        return this;
    }

    public AddEmployee set(String firstname, String middlename, String lastname) {
        FirstName.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(firstname);
        MiddleName.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(middlename);
        LastName.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(lastname);
        return this;
    }

    public AddEmployee set(String username, String password) {
        CreateLoginDetails.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        Username.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(username);
        Password.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(password);
        ConfirmPassword.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(password);
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