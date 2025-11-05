package thisKey;

public class ThisJava 
{
	int var;
	public ThisJava(int var)
	{
		this.var= var;
		System.out.println("Value is: "+var);
	}
	
	public static void main(String[] args)
	{
		ThisJava tsj=new ThisJava(10);
	}
}
