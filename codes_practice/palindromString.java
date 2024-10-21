package codes_practice;

import java.util.Scanner;

public class palindromString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String org_str = str;

        StringBuffer sb = new StringBuffer(str);
        StringBuffer rev = sb.reverse();
        

        if(org_str.equals(rev.toString()
        )){
            System.out.println(org_str + " is a palindrome");
        }
        else{
            System.out.println(org_str + " is not a palindrome");
        }

    }
}


// package codes_practice;
// import java.util.Scanner;
// public class palindromString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string: ");
//         String str = sc.next();
//         String org_str = str;
//         String rev = "";
//         int len = str.length();
//         for (int i = len-1; i >= 0; i--){
//             rev = rev + str.charAt(i);
//         }
//         if(org_str.equals(rev)){
//             System.out.println(org_str + " The string is a palindrome");
//         }
//         else{
//             System.out.println("The string is not a palindrome");
//         }
//     }
// }
