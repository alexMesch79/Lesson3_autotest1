package tests;

import org.junit.jupiter.api.Test;

public class RegistrationFormWIthFakerTests extends TestsBase {

    @Test
    void formTest() {
        TestData testData = new TestData();
        String aFirstName = testData.firstName,
                aLastName = testData.lastName,
                aUserMail = testData.email,
                aNumber = testData.numberPhone,
                aAdress = testData.adressFild,
                aGenderMale = testData.aGender,
                aHobby = testData.aHobby,
                aFile = testData.aFile,
                aState = testData.aState,
                aCity = testData.selectingCity(aState),
                aDataBirthDay = testData.aDataBirthDay,
                aDataBirthMonth = testData.aDataBirthMonth,
                aDataBirthYear = testData.aDataBirthYear,
                aSymbol = testData.aSymbol,
                aValue = testData.aSubjects;


        formPageTest.openPage()
                .setFirstName(aFirstName)
                .setLastName(aLastName)
                .setUserMail(aUserMail)
                .setNumber(aNumber)
                .setGenderMale(aGenderMale)
                .setDateBirht(aDataBirthDay, aDataBirthMonth, aDataBirthYear)
                .setSubject(aSymbol, aValue)
                .setHobby(aHobby)
                .uploadFile(aFile)
                .setAdress(aAdress)
                .setState(aState)
                .setCity(aCity)
                .clickSubmit()
                .checkResult("Student Name", aFirstName + " " + aLastName)     // проверка результатов
                .checkResult("Student Email", aUserMail)
                .checkResult("Gender", aGenderMale)
                .checkResult("Mobile", aNumber)
                .checkResult("Date of Birth", aDataBirthDay + " " + aDataBirthMonth + "," + aDataBirthYear)
                .checkResult("Subjects", aValue)
                .checkResult("Hobbies", aHobby)
                .checkResult("Picture", aFile)
                .checkResult("Address", aAdress)
                .checkResult("State and City", aState + " " + aCity);
    }

}
