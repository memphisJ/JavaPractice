import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
    public static void main(String...args){
        System.out.println("create an array from 1 to 10 and skip the first 5 elements.");
        IntStream
                .range(1,10)
                .skip(5)
                .forEach(x->System.out.println(x));
        System.out.println("-------------------------------------");

        System.out.println("just print the odds number from 1 to 10");
        IntStream
                .range(1,10)
                .filter(i -> i%2==0)
                .forEach(x ->System.out.println(x));
        System.out.println("-------------------------------------");

        System.out.println("Working with array for Strings");
        String[] names = {"All", "Carlos", "Pepe", "Hector", "Hugo"};
        Arrays.stream(names)
                .filter(x -> x.startsWith("H"))
                .forEach(System.out::println);

        JavaStreams javaStreams = new JavaStreams();
        System.out.println(javaStreams.getEvenNumbers(20).toString());

    }

    public List<Integer> getEvenNumbers(int limit){
        return Stream.iterate(10, i-> i+1)
                .filter(i->i%2==0)
                .limit(limit)
                .collect(Collectors.toList());
    }
}
