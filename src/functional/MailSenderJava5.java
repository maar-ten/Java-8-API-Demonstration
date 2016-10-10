package functional;

import functional.java5.filters.Females;
import functional.java5.getters.MailAddress;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MailSenderJava5 {

    public void send(List<Person> persons) {
        Females includeFemales = new Females();

        MailAddress addressGetter = new MailAddress();
        Consumer<String> mailer = new Consumer<String>() {
            @Override
            public void accept(String mailAddress) {
                sendMail(mailAddress);
            }
        };

        filterAndDo(
                persons,
                includeFemales,
                addressGetter,
                mailer
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
