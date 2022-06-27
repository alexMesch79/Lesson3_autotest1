package tests;

import com.github.javafaker.Faker;

import java.util.Locale;
import java.util.Random;

public class TestData {

    Faker faker = new Faker(new Locale("en"));

    public int getRandomInt(int min, int max) {
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    public String selectingCity(String userState) {
        String[] city1 = {"Delhi", "Gurgaon", "Noida"};
        String[] city2 = {"Agra", "Lucknow", "Merrut"};
        String[] city3 = {"Karnal", "Panipat"};
        String[] city4 = {"Jaipur", "Jaiselmer"};
        String aCity = null;
        switch (userState) {
            case "NCR":
                aCity = city1[getRandomInt(0, 2)];
                break;
            case "Uttar Pradesh":
                aCity = city2[getRandomInt(0, 1)];
                break;
            case "Haryana":
                aCity = city3[getRandomInt(0, 2)];
                break;
            case "Rajasthan":
                aCity = city4[getRandomInt(0, 1)];
                break;
        }
        return aCity;

    }


    String firstName = faker.name().firstName(),
            lastName = faker.name().lastName(),
            email = faker.internet().emailAddress(),
            numberPhone = faker.phoneNumber().subscriberNumber(10),
            adressFild = faker.address().streetAddress(),
            aSymbol = "a";


    String[] sex = {"Male", "Female", "Other"};
    String aGender = sex[getRandomInt(0, 2)];


    String aDataBirthDay = String.valueOf(getRandomInt(1, 28)),
            aDataBirthYear = String.valueOf(getRandomInt(1900, 2000));
    String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    String aDataBirthMonth = month[getRandomInt(0, 11)];
    String[] subjects = {"Maths", "Accounting", "Arts", "Social Studies"};
    String aSubjects = subjects[getRandomInt(0, 3)];
    String[] hobbies = {"Sports", "Reading", "Music"};
    String aHobby = hobbies[getRandomInt(0, 2)];
    String aFile = "Picture.jpg";

    String[] state = {"NCR", "Haryana", "Rajasthan", "Uttar Pradesh"};
    String aState = state[getRandomInt(0, 3)];


}
