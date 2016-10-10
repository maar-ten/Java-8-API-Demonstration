package functional;

import functional.java8.Filters;
import functional.java8.Getters;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MailSenderJava8 {

    public void send(List<Person> persons) {
        Consumer<String> sendMail = mailAddress -> sendMail(mailAddress);

        filterAndDo(
                persons,
                Filters.FEMALES.getFilter(),
                Getters.MAIL_ADDRESS,
                sendMail
        );
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
