package obsquraJavaClass;
public class ReturnInst
{
 public static void main(String[] args)
   {
     ReturnInst non = new ReturnInst();
	 non.sum();
	 System.out.println("Value is = "+non.sum());
	 System.out.println(non.data("Output"));
   }
   public int sum()
   {
     int a=10;
     return a;
   } 
   public String data(String str)
   {
     System.out.println(str);
	 return str;
   }
}