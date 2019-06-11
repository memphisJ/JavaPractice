import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by hmartinez on 6/11/2019.
 */
public class CountOddNUmbersBelowN {

    public static void main(String...args){
        CountOddNUmbersBelowN countOddNUmbersBelowN = new CountOddNUmbersBelowN();
        System.out.println(countOddNUmbersBelowN.oddCount3(15));
    }

    public void oddCount(int number){
        for (int i=0;i<number; i++){
            if(i%2!=0){
                System.out.print(i + " ");
            }
        }
    }

    public void oddCount2(int number){
        List<Integer> numbers = new ArrayList<>();
        for(int i=0; i<number; i++){
            numbers.add(i);
        }

        Stream<Integer> streamInteger = numbers.stream();
        List<Integer> l = streamInteger.filter(i -> i%2!=0).collect(Collectors.toList());
        System.out.println(l.stream().count());
        l.forEach(i-> System.out.print(i + " "));
    }

    public int oddCount3(int number){
        //Stream<Integer> streamInteger = Stream.generate(() -> i+1).limit(number);
        //Stream<Integer> streamInteger = Stream.iterate(0, n -> n + 1).limit(number).filter(i -> i%2!=0).forEach(j -> System.out.print(j + " "));
        return (int)Stream.iterate(0, n -> n + 1).limit(number).filter(i -> i%2!=0).count();
        //streamInteger.forEach(j-> System.out.print(j + " "));
    }
}
