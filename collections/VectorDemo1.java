package collections;

import java.util.Vector;

public class VectorDemo1 {
    public static void main(String[] args) {
        new VectorDemo1().f1();
    }

    private void f1() {
        Vector vector1=new Vector();
        System.out.println(vector1.capacity());
        vector1.add(1);
        vector1.addElement(22.333);
        vector1.add(null);
        vector1.addElement(1);
        vector1.add("Vikram");
        vector1.add('A');

        System.out.println("Vector Objects : "+vector1);
        System.out.println("Object at index position '2' : "+vector1.elementAt(2));

        System.out.println("First object in vector : "+vector1.firstElement());
        System.out.println("Last object in vector : "+vector1.lastElement());


        vector1.setElementAt(100,0);

        System.out.println("Vector objects : "+vector1);


        vector1.insertElementAt(900,0);
        System.out.println("Vector objects : "+vector1);

    }
}