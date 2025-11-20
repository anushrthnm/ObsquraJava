package accessModifier;

public class Access2 extends Access1 {

	public static void main(String[] args) 
	{
		Access1 acc=new Access1();
		acc.Display1();
		//acc.Display2(); //private method
		acc.Display3();
		acc.Display4();
	}

}
