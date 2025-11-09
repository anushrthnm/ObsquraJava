package stringpgms;

public class StrBuilder {

	public static void main(String[] args) 
	{
		StringBuilder str=new StringBuilder("Test");
		System.out.println(str);
		
		//1. Append
		str.append(" Append");
		System.out.println(str);
		
		//2.Insert
		str.insert(11, "s");
		System.out.println(str);
		
		//3.Replace
		str.replace(5, 12, "Java");
		System.out.println(str);
		
		//4.Substring
		System.out.println(str.substring(5));
		System.out.println(str.substring(0, 2));
		
		//5.Delete
		str.delete(5, 12);
		System.out.println(str.delete(5,12));
		//System.out.println(str);
		
		//6.CharAt
		System.out.println(str.charAt(3));
		
		//7.Capacity
		System.out.println(str.capacity());
		StringBuilder b=new StringBuilder();
		System.out.println(b.capacity());
		
		//8.Length
		System.out.println(str.length());
		
		//9.Reverse
		System.out.println(str.reverse());
	
	}

}
