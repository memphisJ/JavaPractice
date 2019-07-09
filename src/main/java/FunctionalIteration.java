import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Created by hmartinez on 7/8/2019.
 */
public class FunctionalIteration {
    public static void main(String...args){
        List<String> letters = Arrays.asList("A","B","C","D","E","F","G","H");
        Consumer<String> consumer = s -> System.out.print(s);
        letters.forEach(consumer);
        System.out.print("\n");
        letters.stream().forEach(consumer);
        System.out.println("\n");
        System.out.println("Parallel Streams");
        letters.parallelStream().forEach(System.out::print);

    }
}

