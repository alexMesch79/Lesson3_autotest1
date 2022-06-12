package pages;

import pages.components.CalendarCom;
import pages.components.InputCom;
import pages.components.ResultTable;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class FormPageTest {
    String sFirstName = "#firstName";
    String sLastName = "#lastName";
    String sUserEmail = "#userEmail";
    String sGender = "#genterWrapper";
    String sAdress = "#currentAddress";
    String sNumber = "#userNumber";
    String sDataofBrith = "#dateOfBirthInput";
    String sSubject = "#subjectsInput";
    String sUploadPic = "#uploadPicture";
    String sState = "#react-select-3-input";
    String sCity = "#react-select-4-input";
    String sSubmit = "#submit";
    CalendarCom CalendarCom = new CalendarCom();
    InputCom InputCom = new InputCom();
    ResultTable ResultTable = new ResultTable();


    public FormPageTest openPage() {
        open("automation-practice-form/");
        return this;
    }

    public FormPageTest setFirstName(String value) {
        $(sFirstName).setValue(value);
        return this;
    }

    public FormPageTest setLastName(String value) {
        $(sLastName).setValue(value);
        return this;
    }

    public FormPageTest setUserMail(String value) {
        $(sUserEmail).setValue(value);
        return this;
    }

    public FormPageTest setGenderMale(String value) {
        $(sGender).$(byText(value)).click();
        return this;
    }

    public FormPageTest setAdress(String value) {
        $(sAdress).setValue(value);
        return this;
    }

    public FormPageTest setNumber(String value) {
        $(sNumber).setValue(value);
        return this;
    }

    public FormPageTest setDateBirht(String day, String month, String year) {
        $(sDataofBrith).click();
        CalendarCom.SetDate(day, month, year);
        return this;
    }

    public FormPageTest setSubject(String symbol, String value) {
        $(sSubject).sendKeys(symbol);
        $(byText(value)).click();
        return this;
    }

    public FormPageTest setHobby(String value) {
        $(byText(value)).click();
        return this;
    }

    public FormPageTest uploadFile(String value) {
        $(sUploadPic).uploadFromClasspath(value);
        return this;
    }

    public FormPageTest setState(String value) {
        InputCom.SetValue(sState, value);
        return this;
    }

    public FormPageTest setCity(String value) {
        InputCom.SetValue(sCity, value);
        return this;
    }

    public FormPageTest clickSubmit() {
        $(sSubmit).click();
        return this;
    }

    public FormPageTest checkResult(String key, String value) {
        ResultTable.checkResult(key, value);
        return this;
    }

}
