

/*Q2.WAP USING FUNCTION TO PRINT THE FOLLOWING PATTERN 
*
**
***
*****/

// public class method {
//     static void pattern(int n){
//         for(int i=0;i<i+1;i++){
//             for(int j=n;j>i;j--){
//             System.out.print("*");
//             }
        
//         System.out.println();

//     }
//     }
//      public static void main(String[] args) {
//         pattern(4);
//     }
// }

// public class method{
//     static int sumRect(int n){
//         if(n==1){
//             return 1;
//         }
//        return n + sumRect(n-1);
//     }
//  public static void main(String[] args) {
    
//  {
//     int c =sumRect(3);
//     System.out.print("sum of natural number is:"+c);
// }
// }
// }
public class method{
    static int fib(int n){
    //     if(n==1){
    //         return 0;
    //     }
    //    else if(n==2){
    //        return 1;
    //    }
    if(n==1 || n==2 ){
       return n-1;
    }
       else {
         return fib(n-1) + fib(n-2);  
       }
    }
 public static void main(String[] args) {
    
 {
    int result =fib(5);
    System.out.println("Fibonacci result \n" + result);
}
}
}


