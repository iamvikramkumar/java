package string;

import java.util.Scanner;

public class BalancedWord1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = sc.nextLine();
        if (isBalanced(word)) {
            System.out.println(word + " is balanced.");
        } else {
            System.out.println(word + " is not balanced.");
        }
    }

    public static boolean isBalanced(String word) {
        int leftSum = 0;
        int rightSum = 0;
        int mid = word.length() / 2;

        for (int i = 0; i < mid; i++) {
            leftSum += Character.toLowerCase(word.charAt(i)) - 'a' + 1;
        }
        for (int i = word.length() - 1; i >= mid; i--) {
            rightSum += Character.toLowerCase(word.charAt(i)) - 'a' + 1;
        }

        return leftSum == rightSum;
    }
}
