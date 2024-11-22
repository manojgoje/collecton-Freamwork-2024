package ListPackage;

import java.util.Enumeration;
import java.util.Vector;

public class Vector_03 {

    public static void main(String[] args) {

        Vector v = new Vector();

        for(int i = 0; i<10; i++)
        {
            v.add(i);
        }

        System.out.println(v);

        System.out.println(v.contains(5));

        System.out.println(v.firstElement());
        System.out.println(v.lastElement());

        System.out.println(v.removeElement(6));
        v.removeElementAt(0);

        System.out.println(v.getFirst());
        System.out.println(v.capacity());


        System.out.println("printing elements by Cursor");
        Enumeration e = v.elements();

        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }
    }
}





















