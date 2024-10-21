class MyThread extends Thread{
    public void run(){
        int i=0;
       // while(true)
       while(i<40000){
        System.out.println("My cooking Thread is running ");
        System.out.println("I am happy");
        i++;
        }
    } 
}
class MyThread2 extends Thread{
    public void run(){
        int i=0;
        while(i<40000){
        System.out.println("My Thread2 for chatting with her");
        System.out.println("I am sad");
        i++;
        }
    } 
}
public class thread70 {
    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();
    }
}
