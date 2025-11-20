package interfaceJ;

public class IntrfceC implements IntrfceP
{
	public void print()
	{
		System.out.println("Interface defined");
	}
	public void display(String txt)
	{
		System.out.println("Text Sent is: "+txt);
	}
	public static void main(String[] args) 
	{
		IntrfceP test=new IntrfceC();
		test.print();
		test.display("Abstract Print Check");
	}
}
