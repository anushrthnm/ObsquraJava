package obsquraJavaClass;
public class CommandLine
{
   public static void main(String args[])
   {
	   String s = args[0];
	   int a = Integer.parseInt(args[1]);
	   float b = Float.parseFloat(args[3]);
	   double c = Double.parseDouble(args[2]);
	   char d = args[4].charAt(0);
	   
	   System.out.println(s+" "+a+" "+b+" "+c+" "+d);
   }

}