package SetPackage;

import javax.net.ssl.SSLEngineResult;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet_01 {

    public static void main(String[] args) {

        HashSet hs = new HashSet();

        // default size is 16 and load factor is 0.75
        // HashSet is not a index based data Structre
        // hashset do not store duplicate elements


       for(int i=1; i<6; i++)
       {
           hs.add(i);
       }


        hs.add(111);
        hs.add(222);
        hs.add(333);
        hs.add(444);
        hs.add(555);
        hs.add(666);
        hs.add(null);
        hs.add(333);
        hs.add(null);
        hs.add(4);


       System.out.println(hs.size());
        System.out.println(hs);


        System.out.println("printing elements via iterator  : ");


        Iterator itr = hs.iterator();

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }








    }
}
