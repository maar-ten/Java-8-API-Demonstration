package functional.java5.filters;

import functional.Person;

import java.util.function.Predicate;

public class Males implements Predicate<Person> {
    @Override
    public boolean test(Person person) {
        return person.sex == Person.Sex.MALE;
    }
}
