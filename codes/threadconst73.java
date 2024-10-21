class MyThr extends Thread{
    //constructor
    public MyThr(String name){
          super(name);
    }
    public void run(){
        int i=30;
        System.out.println("Thankyou");
       

        // while(true){
        //     System.out.println("I am a thread");
        }
    }

public class threadconst73 {
    public static void main(String[] args) {
        MyThr t1= new MyThr("Vikram");
        MyThr t2=new MyThr("Lucky");
        t1.start();
        t2.start();
        System.out.println("THE ID OF THE THREAD T IS"+t1.getId());
        System.out.println("THE ID OF THE THREAD T IS"+t2.getId());
        System.out.println("THE Name OF THE THREAD T IS"+t1.getName());
        System.out.println("THE Name OF THE THREAD T IS"+t2.getName());

    }
}
