package SetPackage;

import java.util.TreeSet;

public class TreeSet_03 {
    public static void main(String[] args) {


        TreeSet ts = new TreeSet();

        ts.add(100);
        ts.add(200);
        ts.add(10);
        ts.add(300);
        ts.add(1000);
        ts.add(800);
        ts.add(1);

        ts.add(1);
//        ts.add("AAA");

        System.out.println(ts);
        System.out.println(ts.contains(200));
        System.out.println(ts.first());
        System.out.println(ts.size());




//        treeset will not  follows insertion order
//                treeset is only class in set and list which folllows sorting order
//        it not accespet duplicate values
//        it is only store the homogenious type of data

    }
}
