package obsquraAssnment;

import java.util.HashMap;

public class SpecialChar 
{
   public static void specialCheck(String text)
   {
	   HashMap<Character,Integer> count= new HashMap<Character,Integer>();
	   
	   for (char ch:text.toCharArray())
	   {
		   if(!(ch>='a'&&ch<='z')&&!(ch>='A'&&ch<='Z')&&!(ch>='0'&&ch<='9'))
		   {
			   if(count.containsKey(ch))
					   {
				          count.put(ch,count.getOrDefault(ch, 0)+1);
					   }
			   else
			   {
				   count.put(ch,1);
			   }
		   }		   
	   }
	   System.out.println(count);
    }
	   
	   public static void main(String[] args)
	   {
		   specialCheck("$uper$M@n");
	   } 	 
   }
   

