package ListPackage;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_01 {
    public static void main(String[] args) {


        ArrayList al = new ArrayList();


        al.add(100);
        al.add(200);
        al.add(300);
        al.add(400);
        al.add(500);


        ArrayList al2 = new ArrayList();


        al2.add(100);
        al2.add(200);
        al2.add(300);
        al2.add(400);
        al2.add(500);




        System.out.println(al.size());
        System.out.println("set methods output is  "+al.set(0,"pp"));
        System.out.println("contains method output is  "+al.contains("pp"));

       System.out.println("add all methods otput is  "+ al.addAll(al2));

       System.out.println(al);


        ListIterator li = al.listIterator();
        while ((li.hasNext()))
        {
            System.out.println(li.next());
        }


    // ArrayList Does Not provide the method for Mesuring the capacity while vector provides
        // measuring arrayList size
        // (old capacity + 3) / 2+1 ;
        // this formula is used to measure array list size (default size of arrayList is 10)






    }

}
