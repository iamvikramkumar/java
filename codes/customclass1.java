
// class Employee1{
//     int salary;
//     String name;
//     public int getSalary(){
//         return salary;
//     }
//     public String getName(){
//         return name;
//     }
//     public void setName(String n){
//         name=n;
//     }
// }
// public class customclass1 {
//     public static void main(String[] args) {
//         Employee1 vikram = new Employee1();
//         vikram.setName("Vikram");
//         vikram.getName();
//         vikram.salary=20000;
//         vikram.getSalary();
//         System.out.println("This is " + vikram.getName());
//         System.out.println("Salary of Vikram = " + vikram.getSalary());
//     }
// }

//Q2.Create a class cellphone with methods to print "ringing...","vibrating..." etc.
class  cellphone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling VK.");
    }
}
public class customclass1 {
         public static void main(String[] args){
          cellphone in = new cellphone();
           in.vibrate();
           in.ring();
           in.callFriend();
         }
        }