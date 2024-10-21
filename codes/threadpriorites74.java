class MyThr1 extends Thread{
    //constructor
    public MyThr1(String name){
          super(name);
    }
    public void run(){
        int i=30;
       

         while(true){
        //  System.out.println("I am a thread");
        System.out.println("Thankyou"+this.getName());

        }
    }
}
public class threadpriorites74 {
    public static void main(String[] args) {
        MyThr1 t1 = new MyThr1("Vk1"); 
        MyThr1 t3 = new MyThr1("Vk2"); 
        MyThr1 t4 = new MyThr1("Vk3"); 
        MyThr1 t5 = new MyThr1("Vk4"); 
        MyThr1 t6 = new MyThr1("Vk5"); 
        MyThr1 t7 = new MyThr1("Vk6"); 
        MyThr1 t8 = new MyThr1("Vk7(most important)"); 
        t1.setPriority(Thread.MAX_PRIORITY);   
        t3.setPriority(Thread.MIN_PRIORITY);   
        t4.setPriority(Thread.MIN_PRIORITY);   
        t5.setPriority(Thread.MIN_PRIORITY);   
        t6.setPriority(Thread.MIN_PRIORITY);   
        t1.start();
        t3.start(); 
        t4.start();  
        t5.start();
        t6.start();
        t7.start(); 
        t8.start();  
       

    }
}
