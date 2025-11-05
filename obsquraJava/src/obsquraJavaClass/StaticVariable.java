package obsquraJavaClass;
public class StaticVariable
{

  static String name= "Naruto";
  static int age;
  public static void displayName()
  {
    age= 33;
	System.out.println("Age is: "+age);
  }
  
  public static void main(String args[])
   {
	   System.out.println("Name is: "+name);
	   displayName();
   }
}