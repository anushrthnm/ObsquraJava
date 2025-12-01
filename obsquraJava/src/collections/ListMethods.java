package collections;
import java.util.*;

public class ListMethods {

	public static void main(String[] args) 
	{
       List <String> lis=new ArrayList<String>();
       //Method1 add()
       lis.add("Minato");
       lis.add("Jiraiya");
       lis.add("Kakashi");
       lis.add("Naruto");
       lis.add("Minato");
       System.out.println(lis);
       
       //Method2 get()
       System.out.println(lis.get(2));
       
       //Method3 set()
       lis.set(4, "Yamato");
       System.out.println(lis);
       
       //Method4 indexof()
       //in case of repeated values first occurence index is shown
       System.out.println(lis.indexOf("Naruto"));
       
      //Method5 lastindexof()
      //to get index of last occurence
       lis.add("Jiraiya");
       System.out.println(lis.lastIndexOf("Jiraiya"));
       
      //Method6 remove()
       lis.remove(5);
       System.out.println(lis);
       
       //Method7 contains()
       System.out.println(lis.contains("Jiraiya"));
       System.out.println(lis.contains("Sasuke"));
       
       //Method8 isEmpty()
       System.out.println(lis.isEmpty());
       
       //Method9 size()
       System.out.println(lis.size());
	}

}
