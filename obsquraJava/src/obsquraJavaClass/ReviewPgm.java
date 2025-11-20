package obsquraJavaClass;

public class ReviewPgm 
{
    public static void main(String[] args)
    {
    	String str= "Java Test";
    	String str1;
    	String str2="";
    	
    	System.out.println("Length of string :"+str.length());
    	System.out.println("3rd character is :"+str.charAt(2));
    	
    	System.out.println("Uppercase string :"+str.toUpperCase());
    	System.out.println("Lowercase string :"+str.toLowerCase());
    	
    	if(str.contains("Test"))
    	{
    		System.out.println("String True");
    	}
    	else
    	{
    		System.out.println("String False");
    	}
    	str1=str;
    	if(str.equals("Test"))
    	{
    		System.out.println("String True");
    	}
    	if(str.equalsIgnoreCase("TEST"))
    	{
    		System.out.println("String True");
    	}
    	if(str2.isEmpty())
    	{
    		System.out.println("String True");
    	}
    	System.out.println("Concat Sting :"+str.concat(str1));
    	
    }
	
}
