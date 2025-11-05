package thisKey;

public class ThisMethod 
{
	public static void main(String[] args)
	{
		ThisMethod thsm=new ThisMethod();
		thsm.display();
	}
	
	public void display()
	{
		System.out.println("Test Method 1");
		this.display2(2);
	}
	public void display2(int par)
	{
		System.out.println("Test Method "+par);
	}
	
}
