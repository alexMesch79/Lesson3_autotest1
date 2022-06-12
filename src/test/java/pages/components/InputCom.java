package pages.components;

import static com.codeborne.selenide.Selenide.$;

public class InputCom {
    public void SetValue(String selector, String value) {
        $(selector).setValue(value).pressEnter();
    }
}
