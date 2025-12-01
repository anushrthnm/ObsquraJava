package collections;
import java.util.*;

public class NonGeneric {

	public static void main(String[] args) 
	{
          List li=new LinkedList();
          li.add("Test");
          li.add(123);
          li.add('A');
          System.out.println(li);
          
          Set st =new HashSet(); //TreeSet() not support non generic
          st.add("test");
          st.add(12345);
          st.add('B');
          System.out.println(st);
          
	}

}
