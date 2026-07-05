package com.cydeo.tests.shorts;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class P24_JavaFakerPractice {

    @Test
    public void javaFakerTest(){

        Faker faker = new Faker();

        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());

        System.out.println("faker.phoneNumber().cellPhone() = " + faker.phoneNumber().cellPhone());

        System.out.println("faker.numerify(\"312-###-####\") = " + faker.numerify("312-###-####"));
        System.out.println("faker.numerify(\"312-###-####\") = " + faker.numerify("312-###-####"));

        System.out.println("faker.letterify(\"?????\") = " + faker.letterify("?????"));

    }

}
