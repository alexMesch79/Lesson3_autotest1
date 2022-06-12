package tests;

import org.junit.jupiter.api.Test;


public class FormTestsWithObjectPageTests extends TestsBase {


    @Test
    void formTest() {
            FormPageTest.openPage()
                    .setFirstName("Vladimir")
                    .setLastName("Ulyanov")
                    .setUserMail("Lenin@yandex.ru")
                    .setGenderMale("Male")
                    .setNumber("9273731234")
                    .setDateBirht("30", "April", "1935")
                    .setSubject("a","Arts")
                    .setHobby("Sports")
                    .setHobby("Reading")
                    .setHobby("Music")
                    .uploadFile("Picture.jpg")
                    .setAdress("RF, Moscow City, Red Area, House 1")
                    .setState("Haryana")
                    .setCity("Panipat")
                    .clickSubmit()
                    .checkResult("Student Name", "Vladimir"+ " " + "Ulyanov")
                    .checkResult("Student Email", "Lenin@yandex.ru")
                    .checkResult("Gender", "Male")
                    .checkResult("Mobile", "9273731234")
                    .checkResult("Date of Birth", "30 April,1935")
                    .checkResult("Subjects", "Arts")
                    .checkResult("Hobbies", "Sports")
                    .checkResult("Hobbies", "Reading")
                    .checkResult("Hobbies", "Music")
                    .checkResult("Picture", "Picture.jpg")
                    .checkResult("Address", "RF, Moscow City, Red Area, House 1")
                    .checkResult("State and City", "Haryana Panipat");


    }

}
