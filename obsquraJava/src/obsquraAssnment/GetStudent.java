package obsquraAssnment;

public class GetStudent 
{
   String name;
   int rollno;
   
   public GetStudent(String name, int rollno)
   {
	   this.name=name;
	   this.rollno=rollno;
   }
    public String getName()
   {
	   return this.name;
   }
   public int getRoll()
   {
	   return this.rollno;
   }
}
