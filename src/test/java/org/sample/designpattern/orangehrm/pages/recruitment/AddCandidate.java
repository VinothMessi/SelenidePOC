package org.sample.designpattern.orangehrm.pages.recruitment;

import com.codeborne.selenide.Selenide;
import org.sample.designpattern.orangehrm.elements.SideNavigationElements;
import org.sample.designpattern.orangehrm.elements.recruitment.AddCandidateElements;
import org.sample.designpattern.orangehrm.pages.Dashboard;

import java.io.File;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class AddCandidate implements AddCandidateElements, SideNavigationElements {
    public AddCandidate hasItLoaded() {
        Heading.shouldBe(visible).shouldHave(appear);
        return this;
    }

    public AddCandidate fill(String firstName, String middleName, String lastName) {
        FirstName.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(firstName);
        MiddleName.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(middleName);
        LastName.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(lastName);
        return this;
    }

    public AddCandidate setVacancy(String role) {
        Vacancy.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        $(withText(role)).shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        return this;
    }

    public AddCandidate fill(String email, String number) {
        Email.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(email);
        ContactNumber.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(number);
        return this;
    }

    public AddCandidate uploadResume(String file) {
        $(".oxd-file-input").uploadFile(new File(file));
        return this;
    }

    public AddCandidate set(String keywords, String date) {
        Keywords.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(keywords);
        Date.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(date);
        return this;
    }

    public AddCandidate type(String notes) {
        Notes.shouldBe(visible).shouldBe(enabled).shouldHave(appear).setValue(notes);
        Consent.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
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