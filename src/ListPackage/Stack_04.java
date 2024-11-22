package ListPackage;

import java.util.Enumeration;
import java.util.Stack;

public class Stack_04 {

    public static void main(String[] args) {

        Stack s = new Stack();

       for(int i = 100;i<=110;i++)
       {
           s.push(i);
       }

        System.out.println(s);

       s.pop();
       s.pop();
       System.out.println(s.search("AAA"));

        System.out.println(s.peek());
       s.push("AAA");

        System.out.println(s.peek());
       s.push("BBB");

        System.out.println(s.peek());


        System.out.println("printing elements via Cursor ");
        System.out.println("we use the Enumeration Cursor Becouse stack is also  a Legacy class ");

        Enumeration e = s.elements();

        while (e.hasMoreElements())
        {
            System.out.println(e.nextElement());
        }


    }
}










