package functional.java5.getters;

import functional.Person;

import java.util.function.Function;

public class MailAddress implements Function<Person, String> {
    @Override
    public String apply(Person person) {
        return person.mailAddress;
    }
}
