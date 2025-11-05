package obsquraJavaClass;

public class ConstClass 
{
	public static void main(String[] args)
	 {
	   ConstClass consts = new ConstClass();
	   ConstClass const1= new ConstClass(2);
	 }
	  public ConstClass()
	  {
	    System.out.println("First constructor");
	  }
	  public ConstClass(int val)
	  {
	    System.out.println("Constructor: "+val);
	  }
}
