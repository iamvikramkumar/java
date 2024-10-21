package codes_practice;

import java.util.Scanner;

public class rev_num {
    public static void main(String[] args) {
        System.out.println("Enter a number for reverse");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int original_num = num;

        int rev = 0;
        while (num!=0) {
            rev = rev*10+num%10;
            num = num/10;
        }
        System.out.println("Reverse of "+original_num+" is "+rev);

    }
}
