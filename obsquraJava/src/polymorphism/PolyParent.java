package polymorphism;

public class PolyParent 
{
  public void display() //method overriding
  {
	  System.out.println("Parent Class");
  }
  
  public void sum(int a, int b) //method overloading
  {
	  System.out.println("Sum: "+(a+b));
  }
  
}
