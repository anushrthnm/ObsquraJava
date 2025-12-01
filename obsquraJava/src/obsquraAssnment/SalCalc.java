package obsquraAssnment;

public class SalCalc extends HRACalc
{

	public static int salSlip(int basic, int deduct, int bonus) 
	{
		int totSal;
		totSal= basic+calcHRA(basic)+calcPF(basic)+bonus-deduct;
		return totSal;
	}
}
