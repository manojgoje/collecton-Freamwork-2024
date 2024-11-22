package MapPackage;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Treemap_03 {
    public static void main(String[] args) {

        TreeMap tm = new TreeMap();

        tm.put(6,"aaa");
        tm.put(2,"bbb");
        tm.put(10,"ccc");
        tm.put(30,"ddd");
        tm.put(25,"eee");
        tm.put(15,"fff");
        tm.put(1,"firstEntry");
        tm.put(100,"lastEntry");


        System.out.println(tm);
        System.out.println(tm.ceilingEntry(8));
        System.out.println(tm.floorEntry(8));
        System.out.println(tm.floorKey(8));
        System.out.println(tm.entrySet());
        System.out.println(tm.firstEntry());
        System.out.println(tm.pollFirstEntry());
        System.out.println(tm.pollLastEntry());


        System.out.println(tm);

//       System.out.println(tm.putFirst(7,"ppp")); explicit positioning is not supporting
//      }
    }
}
