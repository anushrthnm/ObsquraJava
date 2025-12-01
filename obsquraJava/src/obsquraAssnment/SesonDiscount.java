package obsquraAssnment;

public class SesonDiscount 
{
   double price;
   public void discount(double price, Boolean season)
   {
	   this.price = price;
	   double finprice = 0;
	   if(season)
	   {
		   finprice= this.price-(this.price*0.4);
		   System.out.println("You get a 40% discount");
		   System.out.println("Your price after discount is:"+finprice);
	   }          
   }
   public void discount(double price)
   {
	   this.price = price;
	   double finprice = 0;
	   finprice= this.price-(this.price*0.15);
	   System.out.println("You get a 15% discount");
	   System.out.println("Your price after discount is:"+finprice);

   }
}
