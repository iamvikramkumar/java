package string;

public class StringDemo2 {
    public static void main(String[] args) {

     String s1=new String();
     String s2=new String("welcome");

     char[] ch={'a','b','c','d','e','f','g','h'};

     String s3=new String(ch);
     System.out.println(s3);

     byte[] b={97,66,67,68,69,70,71,72,73,74};
     String s4=new String(b);
     System.out.println(s4);

     StringBuffer sb=new StringBuffer("Vikram");

     String s5=new String(sb);

     StringBuilder sb1=new StringBuilder("Kumar");

     String s6=new String(sb1);

        System.out.println(s5);
        System.out.println(s6);


    }
}