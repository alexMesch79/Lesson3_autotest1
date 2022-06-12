package pages;

import pages.components.CalendarCom;
import pages.components.InputCom;
import pages.components.ResultTable;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormPageTest {

    CalendarCom CalendarCom = new CalendarCom();
    InputCom InputCom = new InputCom();
    ResultTable ResultTable = new ResultTable();


    public FormPageTest openPage() {
        open("automation-practice-form/");
        return this;
    }


    public FormPageTest setFirstName(String value) {
        $("[id=firstName]").setValue(value);
        return this;
    }

    public FormPageTest setLastName(String value) {
        $("[id=lastName]").setValue(value);
        return this;
    }

    public FormPageTest setUserMail(String value) {
        $("[id=userEmail]").setValue(value);
        return this;
    }

    public FormPageTest setGenderMale(String value) {
        $("#genterWrapper").$(byText(value)).click();
        return this;
    }

    public FormPageTest setAdress(String value) {
        $("#currentAddress").setValue(value);
        return this;
    }

    public FormPageTest setNumber(String value) {
        $("#userNumber").setValue(value);
        return this;
    }

    public FormPageTest setDateBirht(String day, String month, String year) {
        $("#dateOfBirthInput").click();
        CalendarCom.SetDate(day, month, year);
        return this;
    }

    public FormPageTest setSubject(String symbol, String value) {
        $("#subjectsInput").sendKeys(symbol);
        $(byText(value)).click();
        return this;
    }

    public FormPageTest setHobby(String value) {
        $(byText(value)).click();
        return this;
    }

    public FormPageTest uploadFile(String value) {
        $("#uploadPicture").uploadFromClasspath(value);
        return this;
    }

    public FormPageTest setState(String value) {
        InputCom.SetValue("#react-select-3-input", value);
        return this;
    }

    public FormPageTest setCity(String value) {
        InputCom.SetValue("#react-select-4-input", value);
        return this;
    }

    public FormPageTest clickSubmit () {
        $("[id=submit]").click();
        return this;
    }

    public FormPageTest checkResult(String key, String value) {
        ResultTable.checkResult(key, value);
        return this;
    }

}
