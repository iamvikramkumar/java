package string;

public class StringDemo1 {
    public static void main(String[] args) {
        String city = "Muzaffarpur";
        String employeeName = new String("Vikram");
        String customerName = new String("Vikram");

        String s6 = customerName;
        String s7 = "Vikram";
        String s8 = "Vikram";

        System.out.println(city==employeeName);
        System.out.println(customerName==s6);
        System.out.println(employeeName==s7); 
        System.out.println(s8==s7); //true
    }
}
