package functional.java5.getters;

import functional.Person;

import java.util.function.Function;

public class Age implements Function<Person, Integer> {
    @Override
    public Integer apply(Person person) {
        return person.age;
    }
}
