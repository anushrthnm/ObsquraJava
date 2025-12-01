package collections;
import java.util.*;

public class GenericCollection {

	public static void main(String[] args) 
	{
        List<String> color=new ArrayList<String>();
        color.add("Green");
        color.add("Blue");
        color.add("Red");
        color.add("Orange");
        System.out.println(color);
        
        Set<String> fruit= new HashSet<String>();
        fruit.add("Apple");
        fruit.add("Orange");
        fruit.add("Kiwi");
        fruit.add("Banana");
        fruit.add("Kiwi");
        System.out.println(fruit);
	}

}
