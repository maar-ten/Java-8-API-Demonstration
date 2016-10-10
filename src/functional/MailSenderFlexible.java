package functional;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MailSenderFlexible {

    public void send(List<Person> persons) {
        Predicate<Person> includeFemales = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.sex == Person.Sex.FEMALE;
            }
        };

        Function<Person, String> addressGetter = new Function<Person, String>() {
            @Override
            public String apply(Person person) {
                return person.mailAddress;
            }
        };

        Consumer<String> mailer = new Consumer<String>() {
            @Override
            public void accept(String mailAddress) {
                sendMail(mailAddress);
            }
        };

        filterAndDo(persons, includeFemales, addressGetter, mailer);
    }

    private void filterAndDo(List<Person> persons,
                             Predicate<Person> filter,
                             Function<Person, String> getter,
                             Consumer<String> mailer) {
        for (Person person : persons) {
            if (filter.test(person)) {
                String mailAddress = getter.apply(person);
                mailer.accept(mailAddress);
            }
        }
    }

    private void sendMail(String mailAddress) {
        // send mail
    }
}
