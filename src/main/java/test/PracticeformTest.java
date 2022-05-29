package test;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.$;

public class PracticeformTest {

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com";
        Configuration.browserSize = "1920x1080";
    }
    @Test
    void HomeTask3(){
        open("/automation-practice-form");
        executeJavaScript("$('footer').remove()");
        executeJavaScript("$('#fixedban').remove()");

        $("[id=firstName]").setValue("Vladimir");
        $("[id=lastName]").setValue("Ulyanov");
        $("[id=userEmail]").setValue("Lenin@yandex.ru");
        $("[for=gender-radio-1]").click();
        $("[id=userNumber]").setValue("9273731234");

        $("[id=dateOfBirthInput]").click();
        $(".react-datepicker__month-select").selectOption("April");
        $(".react-datepicker__year-select").selectOption("1935");
        $("[aria-label='Choose Wednesday, April 3rd, 1935']").click();
        $("[id=subjectsInput]").sendKeys("Arts");
        $("[id=subjectsInput]").pressEnter();
        $("[for=hobbies-checkbox-1]").click();
        $("[for=hobbies-checkbox-2]").click();
        $("[for=hobbies-checkbox-3]").click();
        $("[id=uploadPicture]").uploadFile(new File("src/main/java/resources/Picture.jpg"));
        $("[id=currentAddress]").setValue("RF, Moscow City, Red Area, House 1");
        $(byText("Select State")).click();
        $(withText("Haryana")).click();
        $(byText("Select City")).click();
        $(withText("Panipat")).click();

    }

}
