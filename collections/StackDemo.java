package collections;

import java.util.Stack;
import java.util.Vector;

public class StackDemo {
    public static void main(String[] args) {
        new StackDemo().f1();
    }

    private void f1() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push("Vikram");
        stack.push('A');
        stack.push(null);
        stack.push(1013.33);
        stack.push(34);

        System.out.println("Stack Objects :"+stack);
       // System.out.println(stack.pop());
       // System.out.println("Stack Objects :"+stack);
        System.out.println(stack.peek());
        System.out.println("Stack Objects :"+stack);

        System.out.println("Is stack empty?"+stack.isEmpty());

        System.out.println("Object 'Vikram' is at offset position: "+stack.search("Vikram"));


    }
}