class MyThr2 extends Thread{
    public void run(){
         int i=0;
         while(true){
        //  System.out.println("I am a thread");
        System.out.println("Thankyou");
        
        try{
Thread.sleep(455);
        } catch(InterruptedException e){
            e.printStackTrace();
        }
             i++;
        }
    }
}
class MynThr2 extends Thread{
    public void run(){
         int i=0;
         while(i<5620){
        //  System.out.println("I am a thread");
        System.out.println("Thankyou Everyone");
             i++;
        }
    }
}
public class threadmethod75 {
    public static void main(String[] args) {
    MyThr2 t1 = new MyThr2();
    MyThr2 t2 = new MyThr2();
    t1.start();
    // try{
    //     t1.join();
    // }
    // catch(Exception e){
    //     System.out.println(e);
    // }
    
    t2.start();

    }
}
