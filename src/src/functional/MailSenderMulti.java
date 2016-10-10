package src.functional;

import src.functional.java8.Filters;
import src.functional.java8.Getters;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MailSenderMulti {

    public void send(List<Person> persons) {

        Predicate<Person> females = Filters.FEMALES.getFilter();
        Predicate<Person> over18 = Filters.UNDER18.getFilter().negate();
        Predicate<Person> under35 = Filters.OVER35.getFilter().negate();

        Predicate<Person> filter = females.and(over18).and(under35);

        filterAndDo(
                persons,
                filter,
                Getters.MAIL_ADDRESS,
                this::sendMail
        );
    }

    private <T, U> void filterAndDo(List<T> listItems,
                                    Predicate<T> filter,
                                    Function<T, U> getter,
                                    Consumer<U> action) {
        for (T item : listItems) {
            if (filter.test(item)) {
                U value = getter.apply(item);
                action.accept(value);
            }
        }
    }

    private void sendMail(String mailAddress) {
        // send mail
    }
}
