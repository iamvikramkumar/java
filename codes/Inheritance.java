class Base{
    int x;
    public int getX(){
        System.out.println("I am in Base and setting x now");
        return x;
    }
    public void setX(int x){
        this.x=x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }

}
class derived extends Base{
    public int y;
    public int getY(){
        return y;
    }
    public int setY(int y){
        return this.y = y;
    }

}
public class Inheritance {
    
    public static void main(String[] args) {
        Base b =new Base();
        b.setX(4);
        System.out.println(b.getX());
        derived d =new derived();
        d.setX(42);
        System.out.println(d.getX());
    }
}
