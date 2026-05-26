package obsquraAssnment;

import java.util.Scanner;

public class SalCalc extends HRACalc
{

	public void salSlip() 
	{
		double totSal;
		super.getCalc();
		totSal= basic+hra-pf-deduct+bonus;
		System.out.println("Salary Slip");
		System.out.println("Basic"+basic);
		System.out.println("HRA"+hra);
		System.out.println("PF"+pf);
		System.out.println("Deduct"+deduct);
		System.out.println("Bonus"+bonus);
		System.out.println("Total Salary"+totSal);
	}
	
	public static void main(String[] args)
	{
		SalCalc sc= new SalCalc();
		sc.salSlip();
	}
}
