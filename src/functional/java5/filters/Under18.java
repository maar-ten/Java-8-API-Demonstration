package functional.java5.filters;

import functional.Person;

import java.util.function.Predicate;

public class Under18 implements Predicate<Person> {
    @Override
    public boolean test(Person person) {
        return person.age < 18;
    }
}
