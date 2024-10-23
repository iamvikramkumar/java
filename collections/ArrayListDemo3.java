package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo3 {
    public static void main(String[] args) {
        new ArrayListDemo3().f1();
    }

    private void f1() {


        List l1=  List.of();
        List l2=  List.of(1,3,4,5,"Vikram",90.2525,'A',true,1);
        System.out.println(l1.size());
        System.out.println(l2.size());

        System.out.println("List Object L2:"+l2);

        l2.remove(0);

        System.out.println("List Object L2:"+l2);



       }

}