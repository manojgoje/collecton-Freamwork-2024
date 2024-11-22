package MapPackage;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap_01 {

    public static void main(String[] args) {

        Map<Integer,String> m = new HashMap();

        m.put(1,"Manoj");
        m.put(2,"ram");
        m.put(3,"rahul");
        m.put(4,"shiva");
        m.put(5,"ganesh");
        m.put(6,"pranv");
        m.put(7,"vitthal");
        m.put(8,"pranv");

        System.out.println(m);
        System.out.println(m.keySet());
        System.out.println(m.values());
        System.out.println(m.containsKey(8));
        System.out.println(m.containsValue("vishal"));
        System.out.println(m.size());
        System.out.println(m.get(1));


        System.out.println("iterating elements ");





        for (Map.Entry<Integer,String> me : m.entrySet())
        {
            System.out.println(me.getKey() +" -> "+  me.getValue());
        }






    }
}
