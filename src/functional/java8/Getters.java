package functional.java8;

import functional.Person;

import java.util.function.Function;

public class Getters {

    public static final Function<Person, Integer> AGE = person -> person.age;
    public static final Function<Person, String> MAIL_ADDRESS = person -> person.mailAddress;
    public static final Function<Person, String> NAME = person -> person.name;
    public static final Function<Person, Person.Sex> SEX = person -> person.sex;

}
