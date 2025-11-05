package obsquraJavaClass;
public class StaticReturn
{
  
  public static int sum(int a, int b)
  {
	int c;
    c=a+b;
	//System.out.println("Sum is =" +c);
    return c;	
  }
  
  public static void main(String args[])
  { 
	//sum(3,2)
	int c= sum(3,2);
	//System.out.println("Sum is =" +c);
	System.out.println(sum(3,4));
  }
  
}