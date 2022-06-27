package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class PracticeformTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void homeTask3() {
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("#firstName").setValue("Vladimir");
        $("#lastName").setValue("Ulyanov");
        $("#userEmail").setValue("Lenin@yandex.ru");
        $("#genterWrapper").$(byText("Male")).click();
        $("#userNumber").setValue("9273731234");
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOption("April");
        $(".react-datepicker__year-select").selectOption("1935");
        $("[aria-label='Choose Wednesday, April 3rd, 1935']").click();
        $("#subjectsInput").sendKeys("Arts");
        $("#subjectsInput").pressEnter();
        $(byText("Sports")).click();
        $(byText("Reading")).click();
        $(byText("Music")).click();
        $("[id=uploadPicture]").uploadFile(new File("src/test/resources/Picture.jpg"));
        $("#currentAddress").setValue("RF, Moscow City, Red Area, House 1");
        $("#state").click();
        $(byText("Haryana")).click();
        $("#city").click();
        $(byText("Panipat")).click();
        $("[id=submit]").click();

        $(".modal-body").shouldHave(
                text("Vladimir Ulyanov"),
                text("Lenin@yandex.ru"),
                text("Male"),
                text("9273731234"),
                text("3 April,1935"),
                text("Arts"),
                text("Sports, Reading, Music"),
                text("Picture.jpg"),
                text("RF, Moscow City, Red Area, House 1"),
                text("Haryana Panipat"));
    }

}
