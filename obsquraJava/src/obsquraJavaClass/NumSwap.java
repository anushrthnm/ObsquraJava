package obsquraJavaClass;
public class NumSwap
{
   public static void main(String args[])
   {
	int a=10;
	int b=15;
	int c;
	System.out.println("Number 1 is "+a);
	System.out.println("Number 2 is "+b);
	c=a;
	a=b;
    b=c;
	System.out.println("Number 1 after swapping is "+a);
	System.out.println("Number 2 after swapping is "+b);	
   }
}