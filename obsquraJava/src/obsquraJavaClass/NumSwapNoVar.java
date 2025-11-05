package obsquraJavaClass;
public class NumSwapNoVar
{
   public static void main(String args[])
   {
	int a=10;
	int b=15;
	System.out.println("Number 1 is "+a);
	System.out.println("Number 2 is "+b);
    a = a+b;
	b= a-b;
    a=a-b;
	System.out.println("Number 1 after swapping is "+a);
	System.out.println("Number 2 after swapping is "+b);	
   }
}