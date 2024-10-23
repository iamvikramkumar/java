package collections;

import java.util.ArrayList;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        new ArrayListDemo2().f1();
    }

    private void f1() {

        ArrayList list = new ArrayList();
        list.add("A");
        list.add("B");
        list.add('Z');
        list.add(1);
        list.add(null);
        list.add("A");
        System.out.println(list);

        System.out.println("Object at index position '0' is :"+list.get(0));
        list.set(0, "E");

        System.out.println(list);

        list.add(0,"C");

        System.out.println(list);

        list.remove(0);

        list.add(0,"A");
        list.add(5,"A");

        System.out.println(list);

        System.out.println("Index of Object 'A' is :"+list.indexOf("A"));
        System.out.println("Last Index of Object 'A' is :"+list.lastIndexOf("A"));

       }

}