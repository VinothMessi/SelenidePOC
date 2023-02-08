package org.sample.designpattern.orangehrm.elements.recruitment;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public interface RecruitmentElements {
    SelenideElement Heading = $(byTagAndText("h6", "Recruitment"));
    SelenideElement Candidates = $(byLinkText("Candidates")).parent();
    SelenideElement Vacancies = $(byLinkText("Vacancies")).parent();
    SelenideElement AddCandidates = $(byXpath("//button[text()=' Add ']"));
}