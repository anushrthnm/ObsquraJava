package abstraction;

public class AbstractC extends AbstractP{

	public void absP()
	{
		System.out.println("Abstract method of parent class");
	}
	
	public static void main(String[] args) 
	{
//		AbstractC abs=new AbstractC(); //Way 1
		AbstractP abs=new AbstractC(); //Way 2
		abs.absP();
		abs.display();
	}

}
