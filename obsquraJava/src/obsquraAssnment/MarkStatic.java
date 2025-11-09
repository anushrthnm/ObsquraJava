package obsquraAssnment;

public class MarkStatic 
{
    public double MarkStatic(double mark1, double mark2, double mark3) 
    {
    	double totalmark;
    	totalmark= mark1+mark2+mark3;
    	return totalmark;
    }
    public void getGrade(double tot)
    {
    	double perc;
    	perc=(tot/300)*100;
    	if(perc<40)
  	  {
  		  System.out.println("Failed");
  	  }
  	  else if((perc==40)||(perc<=60))
  	  {
  		  System.out.println("Grade D");
  	  }
  	  else if((perc==61)||(perc<=70))
  	  {
  		  System.out.println("Grade C");
  	  }
  	  else if((perc==71)||(perc<=80))
  	  {
  		  System.out.println("Grade B");
  	  }
  	  else if((perc==81)||(perc<=100))
  	  {
  		  System.out.println("Grade A");
  	  }
    }   
	public static void main(String[] args) 
	{
		double total;
		MarkStatic mark=new MarkStatic();
		total= mark.MarkStatic(70, 80, 90);
		mark.getGrade(total);
	}
}
