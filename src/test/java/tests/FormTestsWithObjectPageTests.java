package tests;

import org.junit.jupiter.api.Test;


public class FormTestsWithObjectPageTests extends TestsBase {
    String aFirstName = "Vladimir";
    String aLastName = "Ulyanov";
    String aUserMail = "Lenin@yandex.ru";
    String aGenderMale = "Male";
    String aNumber = "9273731234";
    String aDataBirthDay = "30", aDataBirthMonth = "April", aDataBirthYear = "1935";
    String aSymbol = "a", aValue = "Arts";
    String aHobby1 = "Sports", aHobby2 = "Reading", aHobby3 = "Music";
    String aFile = "Picture.jpg";
    String aAdress = "RF, Moscow City, Red Area, House 1";
    String aState = "Haryana", aCity = "Panipat";


    @Test
    void formTest() {
        FormPageTest.openPage()
                .setFirstName(aFirstName)
                .setLastName(aLastName)
                .setUserMail(aUserMail)
                .setGenderMale(aGenderMale)
                .setNumber(aNumber)
                .setDateBirht(aDataBirthDay, aDataBirthMonth, aDataBirthYear)
                .setSubject(aSymbol, aValue)
                .setHobby(aHobby1)
                .setHobby(aHobby2)
                .setHobby(aHobby3)
                .uploadFile(aFile)
                .setAdress(aAdress)
                .setState(aState)
                .setCity(aCity)
                .clickSubmit()
                .checkResult("Student Name", aFirstName + " " + aLastName)
                .checkResult("Student Email", aUserMail)
                .checkResult("Gender", aGenderMale)
                .checkResult("Mobile", aNumber)
                .checkResult("Date of Birth", aDataBirthDay + " " + aDataBirthMonth + "," + aDataBirthYear)      // 30 April,1935
                .checkResult("Subjects", aValue)
                .checkResult("Hobbies", aHobby1)
                .checkResult("Hobbies", aHobby2)
                .checkResult("Hobbies", aHobby3)
                .checkResult("Picture", aFile)
                .checkResult("Address", aAdress)
                .checkResult("State and City", aState + " " + aCity);


    }

}
