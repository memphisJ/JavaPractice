package Collections.Lists;

import java.util.*;

public class ArrayLoop {
    static public void main(String...args){
        List<String> namesList = new ArrayList<String>(
                Arrays.asList("Zulema","Williemae","Selina","Marianela","Deanna",
                        "Vera","Rubye","Lakenya","Yuk","Maryanna"));
        // Using a loop
        System.out.println("Iteration of a ArrayList using a loop");
        for(int i=0; i<namesList.size(); i++){
            System.out.println(namesList.get(i));
        }
        System.out.println(" ");

        //Using For each
        System.out.println("Iteration of a ArrayList using a For Each");
        for(String name : namesList){
            System.out.println(name);
        }
        System.out.println(" ");

        //Using with a While loop
        int count = 0;
        System.out.println("Iteration of a ArrayList using a While");
        while(namesList.size()>count){
            System.out.println(namesList.get(count));
            count++;
        }
        System.out.println(" ");

        //Using a iterator
        System.out.println("Iteration of a ArrayList using a Iterator");
        Iterator iterator = namesList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        //IN java 8 using Lambda Expression
        System.out.println(" ");
        System.out.println("Iterate the ArrayList using forEach in Java 8");
        namesList.forEach(
                name -> System.out.println(name));
    }
}
