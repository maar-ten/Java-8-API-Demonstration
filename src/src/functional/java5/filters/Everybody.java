package src.functional.java5.filters;

import src.functional.Person;

import java.util.function.Predicate;

public class Everybody implements Predicate<Person> {
    @Override
    public boolean test(Person person) {
        return true;
    }
}
