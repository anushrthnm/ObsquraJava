package abstraction;

public abstract class AbstractP //parent class must be abstract
{
  public abstract void absP();//abstract method
  
  public void display()
  {
	  System.out.println("Non abstract method in abstract class");
  }
}
