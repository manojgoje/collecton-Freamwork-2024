package MapPackage;

import java.util.LinkedHashMap;
import java.util.Set;

public class LinkedHashMap_02 {
    public static void main(String[] args) {


        LinkedHashMap lhm = new LinkedHashMap<>();

        lhm.put(1,"aaa");
        lhm.put(6,"bbb");
        lhm.put(3,"ccc");
        lhm.put(4,"ddd");
        lhm.put(5,"eee");
        lhm.put(2,"fff");
        System.out.println(lhm);

        System.out.println(lhm.containsValue("ccc"));
//        System.out.println(lhm.entrySet());
        System.out.println(lhm.putFirst(50,"zzz"));
        System.out.println(lhm.putLast(100,"yyy"));

        System.out.println(lhm);


//        System.out.println(lhm.values());

        Set keys = lhm.keySet();

        for (Object iterate : keys )
        {
            System.out.println( iterate +" "+ lhm.get(iterate));
        }
    }

}
