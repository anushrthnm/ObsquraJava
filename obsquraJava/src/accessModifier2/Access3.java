package accessModifier2;

import accessModifier.Access1;

public class Access3 extends Access1 {

	public static void main(String[] args) 
	{
		Access1 acc=new Access1();
		acc.Display1();
		//acc.Display2(); //private method
		//acc.Display3(); //protected method
		//acc.Display4(); //default method

		Access3 acc1=new Access3();
		acc1.Display1();
		//acc1.Display2(); //private method
		acc1.Display3();
		//acc1.Display4(); //default method
	}

}
