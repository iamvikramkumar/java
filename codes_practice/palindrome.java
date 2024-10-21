package codes_practice;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check its a palindrome Number or not ? ");
        int num = sc.nextInt();
        int original_num = num;
    
        int rev = 0;
    
        while(num!=0){
            rev = rev*10+num%10;
            num = num/10;
        }
        
        System.out.println("Reversed of " + original_num + " is: " + rev);
    

    if (original_num == rev){
        System.out.println(original_num + " is a palindrome number");
    }
    else {
        System.out.println(original_num + " is not a palindrome number");
    }

}

}
