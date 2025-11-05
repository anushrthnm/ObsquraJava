/* Switch
initialization;
Switch(expression)
{
  case value: 
  stmt/sop;
  break;
  
  case value: 
  stmt/sop;
  break;
  case value: 
  stmt/sop;
  break;
 }
 default:
 Stmt;
 break;
}*/
package obsquraJavaClass;
public class SwitchPgm
{
public static void main(String args[])
  {
	  String day="Monday";
	  switch(day)
	  {
		  case "Sunday":
		  System.out.println("Today is Sunday");
		  break;
		  
		  case "Monday":
		  System.out.println("Today is Monday");
		  break;
		  
		  case "Tuesday":
		  System.out.println("Today is Tuesday");
		  break;
		  
		  case "Wednesday":
		  System.out.println("Today is Wednesday");
		  break;
	  
		  default:
		  System.out.println("Invalid Day");
		  break;
	  }
  }
}