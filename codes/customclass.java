class Employee{
    int id ;
    String name;
    int salary;
    public void printDetails() {
        System.out.println("My id is" + id);
        System.out.println("My name is" + name );
        System.out.println("and my salary is" + salary   );
        
    }
  public  int getSalary(){
       return salary;

    }

}
// class Square{
//     int side;
//     public int area(){
//         return side*side;
//     }
//     public int perimeter(){
//        return 4*side;
//     }
// }

// class Rectangle{
//     int l,b;
//     public int area(){
//         return l*b;
//     }
//     public int perimeter(){
//         return 2*(l+b);
//     }
// }
// class Tommy{
//     public void hit(){
//         System.out.println("Hitting On The Enemy");
//     }
//     public void run(){
//         System.out.println("Running On The Enemy");
//     }
//     public void fire(){
//         System.out.println("Firing On The Enemy");
//     }
// }
class Circle{
   int r;
    public Circle(int r2) {
}
	public int area(){
        return (int) (22/7 * r * r);
    }
    public double perimeter() {
        return 2*3.14*r;
    }
}
public class customclass {

   
    public static void main(String[] args) {
        System.out.println("This is our custom class ");
        //Employee vikram = new Employee();// Inserting a new employee object
        // Employee rohit = new Employee();
        // //setting attributes
        // vikram.id=135;
        // vikram.name="Vikram";
        // vikram.salary=10000;
        // rohit.id=136;
        // rohit.name="Rohit";
        // rohit.salary=12000;
        // //print attrributes
        // //System.out.println("vikram.id");
        // //System.out.println("vikram.name");
        //  vikram.printDetails();
        //  //rohit.printDetails();
        //  int salary=rohit.getSalary();
        // System.out.println(salary);
        // Square sq = new Square();
        // sq.side=3;
        // System.out.println("Area Of Square = " + sq.area());
        // System.out.println("Perimeter of Square = " + sq.perimeter());
        // Rectangle re = new Rectangle();
        // re.l=2;
        // re.b=2;
        // System.out.println("Area of Rectangle =" + re.area());
        // System.out.println("Perimeter of Rectangle =" + re.perimeter());

        //  Tommy game = new Tommy();
        //  game.run();
        //  game.fire();
        //  game.hit();
         
        var cl = new Circle();
        cl.r = 2;
       System.out.println("Area Of Circle = " + cl.area());
       System.out.println("Perimeter Of Circle = " + cl.perimeter());
        }
    }
