package src.functional.java5.getters;

import src.functional.Person;

import java.util.function.Function;

public class Sex implements Function<Person, Person.Sex> {
    @Override
    public Person.Sex apply(Person person) {
        return person.sex;
    }
}
