package org.sample.designpattern.orangehrm.pages.recruitment;

import com.codeborne.selenide.Selenide;
import org.sample.designpattern.orangehrm.elements.recruitment.RecruitmentElements;

import static com.codeborne.selenide.Condition.*;

public class Recruitment implements RecruitmentElements {
    public Recruitment hasItLoaded() {
        Heading.shouldBe(visible).shouldHave(appear);
        Candidates.shouldBe(visible).shouldBe(enabled).shouldHave(appear);
        Vacancies.shouldBe(visible).shouldBe(enabled).shouldHave(appear);
        return this;
    }

    public AddCandidate addCandidate() {
        Candidates.click();
        AddCandidates.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        return Selenide.page(AddCandidate.class);
    }
}