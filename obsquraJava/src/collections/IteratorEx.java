package collections;
import java.util.*;

public class IteratorEx {

	public static void main(String[] args) 
	{
         Set<String> str=new HashSet<String>();
         str.add("Luffy");
         str.add("Zoro");
         str.add("Sanji");
         str.add("Usopp");
         str.add("Nami");       
         System.out.println(str);
         
         for(String st:str) //for each syntax
         {
        	 System.out.println(st);
         }
         
         Iterator <String> itr= str.iterator();
         while(itr.hasNext())
         {     	 
        	 System.out.println(itr.next()); //iterator syntax
         }
         itr.remove();
         System.out.println(str);
	}
}
