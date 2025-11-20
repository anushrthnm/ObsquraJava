package aggregation;

public class Author 
{
 String name;
 int pincode;
 
 public Author(String name,int pincode)
 {
	 this.name=name;
	 this.pincode=pincode;
 }
 
 public void display()
 {
	 System.out.println("Name of author is: "+name);
	 System.out.println("Pincode is: "+pincode);
 }
}
