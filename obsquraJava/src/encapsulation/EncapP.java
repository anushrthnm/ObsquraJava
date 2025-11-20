package encapsulation;

public class EncapP 
{
   private int age;
   private String name;
   
   public void set(int age,String name)
   {
	   this.age=age;
	   this.name=name;
   }
   
   public void get()
   {
	   System.out.println("Name is: "+name);
	   System.out.println("Age is: "+age);
   }
}
