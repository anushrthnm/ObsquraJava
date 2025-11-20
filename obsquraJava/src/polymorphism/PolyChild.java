package polymorphism;

public class PolyChild extends PolyParent
{
	 public void display() //method overriding
	  {
		  System.out.println("Child Class");
		  super.display();
	  }
	  
	  public void sum(int a, int b,int c) //method overloading
	  {
		  System.out.println("Sum: "+(a+b+c));
		  super.sum(a, b);
	  }
	
	public static void main(String[] args) 
	{
		PolyChild pc= new PolyChild();
		pc.display();
		pc.sum(5,10,15);
	}
	
}
