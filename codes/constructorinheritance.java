class Base1{
    Base1(){
        System.out.println("MAi EK Constructor Hu");
    }
    Base1(int a){
             System.out.println("Mai ek overloaded constructor hu with value:" + a);
    }
    public int x;
    public int  getX(){
        return x;
    }
   public void setX(int x){
       this.x=x;
   }
}
class Derived1 extends Base1{
    Derived1(){
        super(0);
        System.out.println("MAi Derived Class KA Constructor Hu");
    }
    Derived1(int a, int b){
        super(a);
        System.out.println("Mai ek overloaded Derived constructor  hu with value:" + b);
}
    public int y;
    public int getY(){
        return y;
    }
    public void setY(int y){
        this.y=y;
    } 
} 
class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am a child of Derived constructor");
    }
    ChildOfDerived(int a,int b,int c){
        super(a,b);
        System.out.println("I am an overloaded constructor of Derived with value of c as:"+ c);

    }
}
public class constructorinheritance{
    public static void main(String[] args) {
        //Base1 b = new Base1();
        //Derived1 d = new Derived1(4,5);
        ChildOfDerived cd = new ChildOfDerived(12,13,15);
       // b.getX();
    }
}
