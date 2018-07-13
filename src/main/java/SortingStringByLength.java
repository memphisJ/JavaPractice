import java.util.*;

public class SortingStringByLength {
    public static void main(String...args){
        List<String> names = new ArrayList<>(Arrays.asList("Melissa","Pedro","Hector","Danery","Carlos"));
        names.forEach(i -> System.out.println(i));

        System.out.println("Sorting the names List........");
        Collections.sort(names, Comparator.comparing(String::length));
        names.forEach(i -> System.out.println(i));

        System.out.println("Print just the strings larger that 6........");
        names.stream()
                .filter(i -> i.length() > 6)
                .forEach(j -> System.out.println(j));
    }
}