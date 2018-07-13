import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaAndObjects {
    public static void main(String...args){
        List<String> datesString = Arrays.asList("2018-07-01 09:20 PM","2018-07-02 10:25 AM","2018-07-04 10:50 PM");
        datesString.forEach(i-> System.out.println(i));

        // Change the datesString into a List<Date>
        System.out.println("Print the same values as LocalDate object");
        List<LocalDateTime> dates;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm a"); // HH -> 24h if hh 12h
        dates = datesString
                .stream()
                .map(date -> LocalDateTime.parse(date,formatter))
                .collect(Collectors.toList());

        dates.forEach(i-> System.out.println(i));

        /*
        List<String> dateStrings = Arrays.asList("12.10.2016", "13.10.2016", "14.10.2016");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        List<LocalDate> localDates = dateStrings.stream().map(date -> LocalDate.parse(date, formatter)).collect(Collectors.toList());
        System.out.println(localDates); */
    }
}