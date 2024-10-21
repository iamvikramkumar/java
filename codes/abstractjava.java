abstract class Parent{
    public Parent(){
        System.out.println("Mai base ka constructor hu");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();
}
class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Namaskar");
    }
}
abstract class Child2 extends Parent{
    public void th(){
        System.out.println("I am Good");
    }
}
public class abstractjava {
    public static void main(String[] args) {
        System.out.println("Abstarct Means Khyali Pulaw");
        Child c=new Child();
      
    }
}
