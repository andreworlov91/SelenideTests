package com.automician.workshops.widgets;


import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class ManageButtons {

    @Step
    public void save() {
        $("#btn-save-data-item").click();
    }
}
