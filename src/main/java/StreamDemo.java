import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamDemo {

    public static void main(String...args){
        //Create a List of Integers
        List<Integer> numbers = Arrays.asList(2,3,4,5);

        //demostration fo map method
        List<Integer> square = numbers.stream().map(x-> x*x).collect(Collectors.toList());
        System.out.println(square);

        // Create a List of Strings
        List<String> names = Arrays.asList("Reflection", "Collection", "Streams");

        //desmostrarion of filter method
        List<String> result = names.stream().filter(s -> s.startsWith("S")).collect(Collectors.toList());
        System.out.println(result);

        //demostration of sorted method
        List<String> sorted = names.stream().sorted().collect(Collectors.toList());
        System.out.println(sorted);

        //Create a List of Integers
        List<Integer> number = Arrays.asList(2,3,4,5,2);

        //collect method return a set
        Set<Integer> squareSet = number.stream().map(x->x*x).collect(Collectors.toSet());
        System.out.println(squareSet);

        // demonstration of forEach method
        number.stream().map(x->x*x).forEach(y->System.out.print(y + " "));

        System.out.println();

        // demonstration of reduce method
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);

        System.out.println(even);


    }
}
