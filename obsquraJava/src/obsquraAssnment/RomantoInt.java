package obsquraAssnment;

import java.util.HashMap;

public class RomantoInt 
{
  
	public static void romantoInt(String num)
	{
		HashMap<Character,Integer> value= new HashMap<Character,Integer>();
		value.put('I', 1);
		value.put('V', 1);
		value.put('X', 1);
		
		int result=0;
		int prevValue=0;
		
		for(int i=num.length();i>=0;i--)
		{
			char currentChar=num.charAt(i);
			int currentVal=value.get(currentChar);
			
			if(currentVal>=prevValue)
			{
				result=result+currentVal;
			}
			else
			{
				result=result-currentVal;
			}
			prevValue=currentVal;
		}
	}
	
}
