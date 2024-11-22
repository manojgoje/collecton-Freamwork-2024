package SetPackage;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet_02
{
    public static void main(String[] args) {

        // hashset and linkedHashSet is almost same function
        // only diff is Hashset will not maintain Insersion order where
        // LinkedHashSet maintained the Insertion Order

//        HashSet Will follow hastTable Data Strucre where LinkedhashSet will follow
//        Hashtable + DoubleLinkList Data Structre

        LinkedHashSet lhs  = new LinkedHashSet();


        for (int i=0;i<50;i++)
        {
            lhs.add(i);
        }
        System.out.println(lhs);

        System.out.println(lhs.getFirst());
        System.out.println(lhs.getLast());
        System.out.println(lhs.reversed());
        System.out.println(lhs.size());


        System.out.println("getting elements By iterator");


       Iterator itr =lhs.iterator();

       while (itr.hasNext())
       {
           System.out.println(itr.next());
       }





















    }
}
