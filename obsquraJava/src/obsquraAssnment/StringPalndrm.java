package obsquraAssnment;

public class StringPalndrm 
{
    public void Paindr(String str)
    {
    	String str1;
    	str1= new StringBuilder(str).reverse().toString();
    	if(str1.equals(str))
    	{
    		System.out.println(str+" and "+str1+" are palindromes");
    	}
    	else
    	{
    		System.out.println(str+" and "+str1+" are not palindromes");
    	}  	
    }
    
	public static void main(String[] args) 
	{
		StringPalndrm strp=new StringPalndrm();
		strp.Paindr("malayalam");
	}
}
