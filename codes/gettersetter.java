
class MyEmployee{
   private int id;
   private String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getId(){
        return id;
    }
    public void setId(int i){
          id = i;
    }
}
public class gettersetter {
   public static void main(String[] args) {
       MyEmployee vikram = new MyEmployee();
       //vikram.id = 45;
      // vikram.name = "Vikram"; throws an error due to private access modifier
     vikram.setName("Vikram");
     System.out.println(vikram.getName());
     vikram.setId(451);
     System.out.println(vikram.getId());
   }
}
