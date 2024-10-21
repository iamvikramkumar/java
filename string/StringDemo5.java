package string;

import java.util.Scanner;

public class StringDemo5 {

    private  static void wordCycle(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter word :");
        String word=sc.next();
        String sequenceWord=word.concat(word);
        System.out.println(sequenceWord);

    }

    public static void main(String[] args) {
        StringDemo5.wordCycle();

        // StringDemo5 obj = new StringDemo5();
        // obj.wordCycle();
    }
}