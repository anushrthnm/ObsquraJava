package thisKey;

public class ThisConst 
{
	public static void main(String[] args)
	{
		ThisConst cons = new ThisConst();
	}
	public ThisConst()
	{
		this(2); //must always be declared as 1st line in constructor
		System.out.println("First Constructor");		
	}
	public ThisConst(int var)
	{
		System.out.println(var+" Constructor came here");
	}
}
