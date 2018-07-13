import com.google.common.collect.Ordering;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaAndObjects {
    public static void main(String...args){
        List<String> datesString = Arrays.asList("2018-07-04 10:20 AM","2018-07-02 09:25 PM","2018-07-01 10:50 PM");
        datesString.forEach(i-> System.out.println(i));

        // Change the datesString into a List<Date>
        System.out.println("Print the same values as LocalDate object.");

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a"); // HH -> 24h if hh 12h
        List<LocalDateTime> dates = datesString
                                    .stream()
                                    .map(date -> LocalDateTime.parse(date,formatter))
                                    .collect(Collectors.toList());

        dates.forEach(i-> System.out.println(i));

        if (Ordering.natural().reverse().isOrdered(dates)) {
            System.out.println("The dates are order in descending order.");
        } else {
            System.out.println("The dates are not order in descending order.");
        }

        /*
        List<String> dateStrings = Arrays.asList("12.10.2016", "13.10.2016", "14.10.2016");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        List<LocalDate> localDates = dateStrings.stream().map(date -> LocalDate.parse(date, formatter)).collect(Collectors.toList());
        System.out.println(localDates); */
    }
}