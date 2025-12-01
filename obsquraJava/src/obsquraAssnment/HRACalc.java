package obsquraAssnment;

public class HRACalc 
{

	public static int calcHRA(int basic)
	{
		int hra;
		hra= (basic*5)/100;
		return hra;		
	}
	
	public static int calcPF(int basic)
	{
		int pf;
		pf= (basic*20)/100;
		return pf;		
	}
}
