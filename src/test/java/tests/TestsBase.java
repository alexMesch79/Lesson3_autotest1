package tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import pages.FormPageTest;

public class TestsBase {
    FormPageTest formPageTest = new FormPageTest();

    @BeforeAll
    static void beforeAll() {
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.browserSize = "1920x1200";

    }
    /*

    Faker faker = new Faker(new Locale("ru"));

    String firstName = faker.address().firstName();
    String lastName = faker.address().lastName();
    String email = faker.internet().emailAddress();

     */

}
