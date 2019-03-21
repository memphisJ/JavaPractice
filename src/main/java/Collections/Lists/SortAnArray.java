package Collections.Lists;

import java.util.ArrayList;
import java.util.List;

public class SortAnArray {
    public static void main(String...args){
        List<Integer> numbers = new ArrayList<Integer>(){{
            add(20);
            add(40);
            add(10);
            add(80);
            add(50);
            add(90);
            add(30);
            add(70);
            add(60);
            add(90);
            add(100);
        }};
        System.out.println("The numbers with out sort it in the ArrayList are:");
        System.out.println(numbers);

        System.out.println(" ");

        // Sort the ArrayList assendig way
     /*   Collections.sort(numbers);
        System.out.println("The numbers int the ArrayList sorted assendig way:");
        System.out.println(numbers);

        System.out.println(" ");

        //Sort the ArrayList desending way
        Collections.reverse(numbers);
        System.out.println("The numbers in the ArrayList sorted desending way:");
        System.out.println(numbers);

        //Sort the ArryaList desending order using Colelctions.reverseOrder
        System.out.println(" ");
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("The numbers in the ArrayList using Collections.reverseOrder:");
        System.out.println(numbers);
*/
    }
}
