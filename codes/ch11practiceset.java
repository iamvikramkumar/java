import java.lang.ref.Reference;

abstract class Pen{
    abstract void write();
    abstract void refill();

}
class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");

    }
    void changeNib(){
        System.out.println("Changing the nib");

    }
}
class Monkey{
    void jump(){
        System.out.println("Jumping...");

    }
    void bite(){
        System.out.println("biting...");
}
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello sir!");

    }
    public void eat(){
        System.out.println("eating...");

    }
    public void sleep(){
        System.out.println("sleeping...");

    }
}
public class ch11practiceset {
    public static void main(String[] args) {
        FountainPen pen = new FountainPen();
        pen.changeNib();
        Human vk = new Human();
        vk.sleep();
        Monkey m1 = new Human();
        m1.bite();
        m1.jump();
        //m1.speak(); --> cannogt use speak methhod because the reference is monkey which does not have speak method
        BasicAnimal lovish = new Human();
        //lovish.speak(); ---> error
        lovish.sleep();
        lovish.eat();
    }
}
