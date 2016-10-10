package src.functional.java5.getters;

import src.functional.Person;

import java.util.function.Function;

public class Name implements Function<Person, String> {
    @Override
    public String apply(Person person) {
        return person.name;
    }
}
