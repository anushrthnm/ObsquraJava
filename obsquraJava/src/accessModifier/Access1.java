package accessModifier;

public class Access1 
{
	public void Display1()
	{
		System.out.println("Public method");
	}
	private void Display2()
	{
		System.out.println("Private method");
	}
	protected void Display3()
	{
		System.out.println("Protected method");
	}
	void Display4()
	{
		System.out.println("Default method");
	}
	public static void main(String[] args) 
	{
		Access1 acc=new Access1();
		acc.Display1();
		acc.Display2();
		acc.Display3();
		acc.Display4();
	}
}

