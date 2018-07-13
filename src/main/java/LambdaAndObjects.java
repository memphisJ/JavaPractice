import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaAndObjects {
    public static void main(String...args){
        List<String> datesString = Arrays.asList("2018-07-01","2018-07-02","2018-07-03","2018-07-04");
        datesString.forEach(i-> System.out.println(i));

        // Change the datesString into a List<Date>
        System.out.println("Print the same values as LocalDate object");
        List<LocalDate> dates;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        dates = datesString
                .stream()
                .map(date -> LocalDate.parse(date,formatter))
                .collect(Collectors.toList());
        dates.forEach(i-> System.out.println(i));

/*
        List<String> dateStrings = Arrays.asList("12.10.2016", "13.10.2016", "14.10.2016");
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        List<LocalDate> localDates = dateStrings.stream().map(date -> LocalDate.parse(date, formatter)).collect(Collectors.toList());
        System.out.println(localDates); */

    }
}
