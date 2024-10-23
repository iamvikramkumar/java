package collections;

import java.util.LinkedList;

public class LinkedDemo {
    public static void main(String[] args) {
        new LinkedDemo().f1();
    }

    private void f1(){
        LinkedList list = new LinkedList();

        list.add(10);
        list.add(1.11);
        list.add(10);
        list.add(null);
        list.add("Vikram");

        System.out.println("Linked List Objects :" + list);

        System.out.println("First Object in LL : "+list.getFirst());
        System.out.println("List Object in LL : "+list.getLast());

        list.addFirst("HCL");
        list.addLast("TATA");
        System.out.println("Linked List Objects after adding First and Last : "+list);
        
        list.removeFirst();
        list.removeLast();
        System.out.println("Linked List Objects after removing First and Last : "+list);
    }
}
