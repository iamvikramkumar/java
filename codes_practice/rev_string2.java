package codes_practice;

import java.util.Scanner;

public class rev_string2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string for reverse: ");
        String str = sc.nextLine();

        //USING CHARACTER ARRAY
        String rev=" ";
        char a[]=str.toCharArray();
        int len = a.length;

        for(int i = len-1; i >= 0; i--){
            rev=rev+a[i];
        }

        System.out.println("Reversed string is :" + rev);

     }
}
