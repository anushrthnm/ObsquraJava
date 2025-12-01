package collections;
import java.util.*;

public class SetMethods {

	public static void main(String[] args) 
	{
        Set <String> set1=new HashSet<String>();
        set1.add("Luffy");
        set1.add("Zoro");
        set1.add("Sanji");
        System.out.println(set1);
        
        Set <String> set2=new HashSet<String>();
        set2.add("Usopp");
        set2.add("Nami");
        set2.add("Chopper");
        System.out.println(set2);
        
        //Method1 addAll()
        set1.addAll(set2);
        System.out.println(set1);
        System.out.println(set2);
        
        //Method2 containsAll()
        //check whether set1 contains all elements of set2 and vice versa
        System.out.println(set1.containsAll(set2));
        System.out.println(set2.containsAll(set1));
        
        //Method3 removeAll()
        set1.removeAll(set2);
        System.out.println(set1);
        
        //All methods in set work for list
        
	}

}
