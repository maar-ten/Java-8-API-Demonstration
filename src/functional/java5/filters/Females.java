package functional.java5.filters;

import functional.Person;

import java.util.function.Predicate;

public class Females implements Predicate<Person> {
    @Override
    public boolean test(Person person) {
        return person.sex == Person.Sex.FEMALE;
    }
}
