package org.sample.designpattern.orangehrm.pages;

import static com.codeborne.selenide.Condition.*;

import com.codeborne.selenide.Selenide;
import org.sample.designpattern.orangehrm.elements.PIMElements;

public class PIM implements PIMElements {
    public PIM hasItLoaded() {
        Heading.shouldBe(visible).shouldBe(enabled).shouldHave(appear);
        return this;
    }

    public AddEmployee addEmployee() {
        AddEmployee.shouldBe(visible).shouldBe(enabled).shouldHave(appear).click();
        return Selenide.page(AddEmployee.class);
    }
}