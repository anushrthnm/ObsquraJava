package obsquraAssnment;
public class Assmt3Pt3
{
  public static void main(String[] args) 
  {
      int mark=75;
      if(mark<40)
	  {
		  System.out.println("Failed");
	  }
	  else if((mark==40)||(mark<=60))
	  {
		  System.out.println("Grade D");
	  }
	  else if((mark==61)||(mark<=70))
	  {
		  System.out.println("Grade C");
	  }
	  else if((mark==71)||(mark<=80))
	  {
		  System.out.println("Grade B");
	  }
	  else if((mark==81)||(mark<=100))
	  {
		  System.out.println("Grade A");
	  }
}
}