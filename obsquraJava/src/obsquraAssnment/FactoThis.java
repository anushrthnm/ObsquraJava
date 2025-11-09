package obsquraAssnment;

public class FactoThis 
{
    int num;
    int fact;
	public int factorialnum(int num)
	{
		this.num=num;
		this.fact=1;
		for(int i=1;i<=num;i++)
		{
			fact= fact*i;
		}
		return fact;
	}
	public void factorDisp(int val)
	{
		this.factorialnum(val);
		System.out.println("Factorial of " + this.num + " = " + this.fact);
	}
	
	public static void main(String[] args) 
	{
		FactoThis fact=new FactoThis();
		fact.factorDisp(5);
	}
}
