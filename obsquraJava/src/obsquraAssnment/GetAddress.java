package obsquraAssnment;

public class GetAddress 
{
  String House;
  String Street;
  String City;
   public GetAddress(String House,String Street,String City)
  {
	   this.House=House;
	   this.Street=Street;
	   this.City=City;
  }
   public void StudDetails(GetStudent stud)
  {
	  System.out.println("Student Name   : " + stud.getName());
      System.out.println("Roll Number    : " + stud.getRoll());
      System.out.print("House Address    : "+this.House);
      System.out.print("House Address    : "+this.Street);
      System.out.print("House Address    : "+this.City);
  }
}
