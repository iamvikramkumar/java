

class A{
    public int a;
    public int harry(){
        return 4;
    }
    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class D extends A{
    @Override
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }
    public void meth3(){
        System.out.println("I am method 3 of class B");
    }
}
public class methodoveride{
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        D b = new D();
        b.meth2();
    }
}
