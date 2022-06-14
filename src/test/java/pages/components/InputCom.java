package pages.components;

import com.codeborne.selenide.SelenideElement;

public class InputCom {

    public void SetValue(SelenideElement selector, String value) {

        selector.setValue(value).pressEnter();
    }
}
