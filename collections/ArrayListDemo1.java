package collections;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        new ArrayListDemo1().f1();
    }

    private void f1() {

        ArrayList al1=new ArrayList();
        ArrayList al2=new ArrayList();

        al2.add("Welcome to ArrayList");

        al1.add(1);
        al1.add(2);
        al1.add("Vikram");
        al1.add(null);
        al1.add(1);
        al1.add("Vikram");
        al1.add(10.3);

        System.out.println("Array List objects :"+al1);
        System.out.println("Size of Array List :"+al1.size());
        System.out.println("Is ArrayList object empty?"+al1.isEmpty());
        System.out.println("Is ArrayList object contains null? "+al1.contains(null));

        Object obj[]=al1.toArray();

        //al1.clear();
        System.out.println("After calling remove() method");
        System.out.println("Array List objects :"+al1);

        System.out.println("Is ArrayList al1 and al2 same? "+al1.equals(al2));

        al1.remove(null);

        System.out.println("Array List objects :"+al1);

        al2.addAll(al1);

        System.out.println("Array List al2 objects :"+al2);

        al2.removeAll(al1);

        System.out.println("Array List al2 objects :"+al2);


    }

}