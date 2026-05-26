package obsquraAssnment;

import java.util.Scanner;

public class GetSalary 
{
  double bonus;
  double deduct;
  double basic;
  
  public void getSalary()
  {
	  Scanner sc=new Scanner(System.in);
		System.out.println("Enter basic pay");
		basic=sc.nextDouble();
		
		System.out.println("Enter deduction");
		deduct=sc.nextDouble();
		
		System.out.println("Enter bonus");
		bonus=sc.nextDouble();
  }
}
