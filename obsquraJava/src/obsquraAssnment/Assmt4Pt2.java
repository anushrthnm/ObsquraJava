package obsquraAssnment;
public class Assmt4Pt2
{
  public static void main(String[] args) 
  {
      int n= 108;
      int rev = 0;
	  System.out.println("OG number is = " +n);
      while (n > 0) 
      {
            rev = rev * 10 + n % 10;
            n = n / 10;
      } 
      System.out.println("Reversed number is = " +rev);
  }
}