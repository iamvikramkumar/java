package string;

public class StringDemo4 {
    public static void main(String[] args) {
        String str = "HelloWorld";

        System.out.println(str.substring(5));
        System.out.println(str.substring(3,9)); //loWorl

        System.out.println("str contains 'lol': " + str.contains("lol"));
        String s1=str.replaceAll(".","Bharat");
        System.out.println(s1);

        String s2=str.replace(".","Bharat");
        System.out.println(s2);

        String s4="abcd";

       byte[] b= s4.getBytes();
       for(int i=0;i<b.length;i++){
           System.out.println(b[i]);
       }

        String s5="  ";
        System.out.println(s5.length());
        //System.out.println(s5.isBlank());
        System.out.println(s5.isEmpty());


    }
}