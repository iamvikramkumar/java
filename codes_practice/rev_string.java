package codes_practice;

import java.util.Scanner;

public class rev_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String for reverse: ");
        String str = sc.next();

        //Using + (String concatenation) opertor

        String rev = " ";

        int len = str.length();

        for (int i = len-1; i >= 0; i--){
            rev = rev + str.charAt(i);
        }

        System.out.println("Reversed String is : " + rev);
    
    }
}
