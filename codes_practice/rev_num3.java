package codes_practice;

import java.util.Scanner;

public class rev_num3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = sc.nextInt();

        //Reverse a Number Using StringBuilder Class

        StringBuilder sbl = new StringBuilder();
        sbl.append(num);
        StringBuilder rev = sbl.reverse();
        System.out.println("Reverse of the number is: "+rev);
}
}