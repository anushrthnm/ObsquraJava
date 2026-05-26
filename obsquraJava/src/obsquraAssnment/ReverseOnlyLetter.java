package obsquraAssnment;

public class ReverseOnlyLetter 
{
    public static void reverseLetter(String str)
    {
    	int left=0;
    	int right= str.length()-1;
    	char stArray[]=str.toCharArray();
    	
    	while(left<right)
    	{
    		if(!Character.isLetter(stArray[left]))
    		{
    			left++;
    		}
    		else if(!Character.isLetter(stArray[right]))
    		{
    			right--;
    		}
    		else
    		{
    			char temp;
    			temp=stArray[left];
    			stArray[left]=stArray[right];
    			stArray[right]=temp;
    			left++;
    			right--;
    		}
    	}
    	System.out.println("Reversed String: "+new String(stArray));
    }
    public static void main(String[] args)
    {
 		
 		reverseLetter("Labs2");
    }
}
