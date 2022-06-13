package pages.components;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class InputCom {
    /*
    public void SetValue(String selector, String value) {

        $(selector).setValue(value).pressEnter();
    }
    */

    public void SetValue(SelenideElement selector, String value) {

        selector.setValue(value).pressEnter();
    }
}
