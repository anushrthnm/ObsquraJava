package obsquraJavaClass;
public class Variable
{
   static int p= 1; //static variable
   int i=2; //instance variable
   public static void main(String args[])
   {
      int n=5; //local variable
	  System.out.println(n);
	  System.out.println(p);
	  Variable v= new Variable();
	  System.out.println(v.i);
   }

}