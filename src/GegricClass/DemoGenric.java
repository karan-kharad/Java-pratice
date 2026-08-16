package GegricClass;

import java.util.ArrayList;
import java.util.Comparator;

public class DemoGenric {
    public static void main(String[] args) {

        // list interface

        // ArrayLsit

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(6);
        list.add(6);
        list.add(6);


        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(6);



        System.out.println(list.contains(2)); // it use to check the the value are presnet in arraylist
        System.out.println(list.get(3)); // its use the get value using the index
        System.out.println(list.equals(list1)); //its use to checke  its same or different
        list.set(2,4);
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
        list.addAll(3,list1);
        System.out.println(list); // it use to to add the anther list elemet to anther list at specific index
        System.out.println(list.hashCode());
        System.out.println( list.containsAll(list1));
        list.sort(Comparator.naturalOrder());
        System.out.println( list);
//        System.out.println(list.size());












        // genric class
        // before genric
//        ArrayList list = new ArrayList();
//
//        list.add("hello");
//        list.add(1);
//        list.add(2.122);

        // genric class

//        ArrayList<Integer> list = new ArrayList<>();
//
//        list.add("hello"); this line showing error
//        list.add(1);
//        list.add(2);



    
    }

}
