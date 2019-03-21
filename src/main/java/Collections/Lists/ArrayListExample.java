package Collections.Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> studentsList = new ArrayList<String>();

        studentsList.add("Harry");
        studentsList.add("Steve");
        studentsList.add("Anuj");
        studentsList.add("Chaintaya");
        studentsList.add("Ajeet");
        // Display all elements from array list
        System.out.println("The students are: " + studentsList + "\n");

        //Add element at the given index
        System.out.println("Add elements in the 0 and 1 position");
        studentsList.add(0, "Rahul");
        studentsList.add(1, "Justin");
        System.out.println("The students are: " + studentsList + "\n");

        //Add elemt at the end with add method
        System.out.println("Add elements with add method");
        studentsList.add("Ted");
        System.out.println("The students are: " + studentsList + "\n");

        //Remove an element
        System.out.println("Remove Harry and Anuj given the name of the element");
        studentsList.remove("Harry");
        studentsList.remove("Anuj");
        System.out.println("The students are: " + studentsList + "\n");

        //Remove element given the postion of the element
        System.out.println("Remove element given the postion of the element [1]");
        studentsList.remove(1);
        System.out.println("The students are: " + studentsList + "\n");

        //Replace the value of the postion 2
        System.out.println("Replace the value of the postion 2 [Chaintaya] -> [Neo]");
        studentsList.set(2, "Neo");
        System.out.println("The students are: " + studentsList + "\n");

        //Gets the postion of the value Ted
        int position = studentsList.indexOf("Ted");
        System.out.println("The position of the Ted element is: " + position + "\n");

        // get the size of the array - number of elements in the List
        System.out.println("Get the size of the array - number of elements in the List");
        int size = studentsList.size();
        System.out.println("The size of the ArrayList is: " + size + "\n");

        // verifies if Ted is in the List
        System.out.println("Verifies if Ted is in the list");
        String resp = studentsList.contains("Ted") ? "Ted is in the List" + "\n" : "Ted is not in the List" + "\n";
        System.out.println(resp);

        //Remove Ted form the ArrayList giving the position of Ted
        System.out.println("Remove Ted from the list giving the postion of Ted");
        studentsList.remove(studentsList.indexOf("Ted"));
        resp = studentsList.contains("Ted") ? "Ted is in the List" + "\n" : "Ted is not in the List now." + "\n";
        System.out.println(resp);

        //Get ArrayList size
        System.out.println("Get ArrayList size");
        size = studentsList.size();
        System.out.println("The size of the ArrayList is: " + size);

        //Clear the ArrayList
        System.out.println("Clear the ArrayList using clar() method.");
        studentsList.clear();
        size = studentsList.size();
        System.out.println("The size of the ArrayList afther using clear method is: " + size);
    }
}
