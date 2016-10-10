package functional.java5.getters;

import functional.Person;

import java.util.function.Function;

public class Name implements Function<Person, String> {
    @Override
    public String apply(Person person) {
        return person.name;
    }
}
