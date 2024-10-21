package codes_practice;

import java.util.Scanner;

public class rev_num2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for reverse: ");
        int num = sc.nextInt();

        //stringBuffer class

        // StringBuffer rev;

        StringBuffer sb = new StringBuffer(String.valueOf(num));
        StringBuffer rev = sb.reverse();

        System.out.println("Reverse Number is: " + rev);

    }
}
