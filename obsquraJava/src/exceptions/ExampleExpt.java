package exceptions;

public class ExampleExpt 
{
	public static void main(String[] args) 
	{
        try 
        {
		int a=10;
        int b=0;
        int c=a/b;
        System.out.println("Output: "+c);
        }
        
        catch(ArithmeticException e)
        {
        	System.out.println("Exception: "+e);
        }
        
        finally
        {
        	System.out.println("Never skip this");
        }
	}
}
