package obsquraAssnment;

public class ageVote 
{
     public static void ageCheck(int age)
     {
        if(age<18)
	    {
		  System.out.println("Uneligible to Vote");
	    }
	    if(age>=18)
	    {
		  System.out.println("Eligible to Vote");
	    }  
      }
	  public static void main(String[] args) 
		{
	       int age =19;
	       ageCheck(age);
		}
}
