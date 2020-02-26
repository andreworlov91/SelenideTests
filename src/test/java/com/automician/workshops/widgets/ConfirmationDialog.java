package com.automician.workshops.widgets;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class ConfirmationDialog {

    private SelenideElement container = $(".noty_type_confirm");

    @Step
    public void confirm() {
        this.container.find(".btn-primary").click();
    }
}
