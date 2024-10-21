interface Bicycle{
    int a=45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int a=45;
    void blowHorn();
    void blowHorn2();
}
class AvonCycle implements Bicycle,HornBicycle{
    void blowHornn(){
        System.out.println("PEE PEE Poo Poo");
    }
   public  void applyBrake(int decrement){
    System.out.println("Applying Brake");
   }
    public void speedUp(int increment){
        System.out.println("Applying SpeedUp");
    }
    public void blowHorn(){
        System.out.println("Kabhi Khusi Kabhi Gam pee ppeee ppeeeeeeeeee");
    }
    public void blowHorn2(){
        System.out.println("Main Hoon Na poo ppoeep peee pooo ");
    }
}
public class interfacess {
    public static void main(String[] args) {
       AvonCycle cyclevk=new AvonCycle();
       cyclevk.applyBrake(1);
       //you can create properties in interfaces
       //cyclevk.a=45;
      // System.out.println(cyclevk.a);
       //you can not modify the properties in interfaces as they are final
      cyclevk.blowHorn();
      cyclevk.blowHorn2();
       
    }
}