package stringpgms;

public class StrMethod 
{
	public static void main(String[] args)
	{
		String str= "test";
		System.out.println("String is: "+str);
		
		//length of string
		System.out.println("Length is: "+str.length());
		
		//charAt
		System.out.println("Character is: "+str.charAt(2));
		
		//equals
		String str1="Test";
		System.out.println("Equals ? "+str.equals(str1));
		
		//equals ignore case
		System.out.println("Equals ? "+str.equalsIgnoreCase(str1));
		
		//value of convert int to string value
		int num =2025;
		String d=String.valueOf(num);
		System.out.println(d);
		
		//string is empty
		System.out.println("Is it empty ?"+str.isEmpty());
		
		//to upper case
		System.out.println("Upper Case: "+str.toUpperCase());
		
		//to lower case
		System.out.println("Lower Case: "+str.toLowerCase());
		
		//contains
		System.out.println("Contains ? "+str.contains("a"));
		
		//concatenation
		String str2;
		str2=str.concat(str1);
		System.out.println("Concatenated String : "+str2);
	}
}
