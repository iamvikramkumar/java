package array;

public class ArrayDemo {
    public static void main(String[] args) {
        new ArrayDemo().f1();
    }

private void f1(){
    int a[] = {1,2,3,4,5};
    // Long[] mobileNumbers={1234567890,7654638,4237492};
    Object[] obj = {1,new ArrayDemo(),"vikram",new StringBuffer("Hello")};

    System.out.println(a[0]);
    System.out.println(obj[3]);

}
}

