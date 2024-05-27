package automationbooking.util;

import com.github.javafaker.Faker;

public class DataGenerator {

    public static String getRandomFirstName() {
        Faker faker = new Faker();
        return faker.name().firstName();
    }

    public static String getRandomLastName() {
        Faker faker = new Faker();
        return faker.name().lastName();
    }

    public static String getRandomName() {
        Faker faker = new Faker();
        String email = faker.name().firstName().toLowerCase() + faker.random().nextInt(0, 100);
        return email;
    }

    public static void main(String[] args) {
        System.out.println(getRandomFirstName());
        System.out.println(getRandomLastName());
    }

}
