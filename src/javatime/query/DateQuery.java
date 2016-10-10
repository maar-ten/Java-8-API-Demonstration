package javatime.query;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalQuery;

public class DateQuery {

    public static void main(String[] args) {
        LocalDate _13th = LocalDate.now().plusDays(4);

        System.out.println(_13th.query(isFriday()));

        for (int i = 1; i < 14; i++) {
            LocalDate nextMonth = _13th.plusMonths(i);
            if (nextMonth.query(isFriday())) {
                System.out.println(nextMonth.format(DateTimeFormatter.ofPattern("E d MMM y")));
            }

        }
    }

    private static TemporalQuery<Boolean> isFriday() {
        return new TemporalQuery<Boolean>() {
            @Override
            public Boolean queryFrom(TemporalAccessor temporal) {
                return DayOfWeek.FRIDAY.getValue() == temporal.get(ChronoField.DAY_OF_WEEK);
            }
        };
    }

}
