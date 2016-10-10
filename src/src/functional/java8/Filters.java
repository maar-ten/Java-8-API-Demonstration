package src.functional.java8;

import src.functional.Person;

import java.util.function.Predicate;

public enum Filters {

    EVERYBODY(person -> true),
    FEMALES(person -> person.sex == Person.Sex.FEMALE),
    FREDJES(person -> person.name.toLowerCase().startsWith("fred")),
    MALES(person -> person.sex == Person.Sex.MALE),
    OVER35(person -> person.age > 35),
    UNDER18(person -> person.age < 18);

    private Predicate<Person> filter;

    Filters(Predicate<Person> filter) {
        this.filter = filter;
    }

    public Predicate<Person> getFilter() {
        return filter;
    }
}
