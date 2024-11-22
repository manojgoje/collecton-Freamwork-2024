package ListPackage;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList_02 {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.add(100);
        ll.add(200);
        ll.add(300);
        ll.add(400);
        ll.add(500);

        System.out.println(ll);

        ll.addFirst("AAA");
        ll.addLast("ZZZ");

        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());

        System.out.println(ll.removeFirst());
        System.out.println(ll.removeLast());

//        System.out.println(ll.remove());


        System.out.println("printing elements");
       Iterator it =  ll.iterator();

       while(it.hasNext())
       {
           System.out.println(it.next());
       }

    }
}
