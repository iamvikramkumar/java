package codes_practice;

import java.util.Scanner;

public class rev_string3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        StringBuffer sb = new StringBuffer(str);
        System.out.println(sb.reverse());

    }
}
