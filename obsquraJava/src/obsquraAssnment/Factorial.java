package obsquraAssnment;

public class Factorial 
{
	public static void factorialnum(int num)
	{
		int factor=1;
		for(int i=1;i<=num;i++)
		{
			factor= factor*i;
		}
		System.out.println("Factorial of "+num+" is: "+factor+" !");
	}
	
	public static void main(String[] args) 
	{
		int n=5;
        factorialnum(n);
	}
}
