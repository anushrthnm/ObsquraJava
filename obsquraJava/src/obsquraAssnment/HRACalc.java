package obsquraAssnment;

public class HRACalc extends GetSalary
{
    double hra;
    double pf;
    
	public void getCalc()
	{
		super.getSalary();
		hra= (basic*5)/100;
		pf= (basic*20)/100;
	}
}
