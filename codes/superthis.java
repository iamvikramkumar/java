

class EkClass{
    int a;
    public int getA(){
        return a;
    }
    EkClass(int v){
       this.a=v;
    }
    public int returnone(){
        return 1;
    }
    class DoClass extends EkClass{
        DoClass(int c){
            super(c);
            System.out.println("Mai ek constructor Hoon");
        }
    }
}
public class superthis {
    public static void main(String[] args) {
        EkClass e=new EkClass(5);
      //  DoClass d=new DoClass(65);
        System.out.println(e.getA());
    }
}
