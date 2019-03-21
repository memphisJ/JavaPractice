package Collections.Lists;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample{
    static public void main(String...args){
        Vector<String> fruitsVector = new Vector<>(5);

        fruitsVector.addElement("Apple");
        fruitsVector.addElement("Orange");
        fruitsVector.addElement("Mango");
        fruitsVector.addElement("Fig");
        fruitsVector.addElement("Apple");

        Enumeration em = fruitsVector.elements();
        while(em.hasMoreElements()) {
            System.out.println(em.nextElement());
        }
    }
}
