package obsquraAssnment;

import java.util.HashMap;
import java.util.Map;

public class StringCountMap 
{
  
	
	public static void repeatChar(String str)
	{
		Map<Character, Integer> counter = new HashMap<Character, Integer>();
		
		for(char ch:str.toCharArray())
		{
			if(counter.containsKey(ch))
			{
				counter.put(ch, counter.getOrDefault(ch, 0)+1);
			}
			else
			{
				counter.put(ch, 1);
			}
		}
		for(char ch:counter.keySet())
		{
			if(counter.get(ch)>1)
			{
				System.out.println("Repeating Chars: "+ch);
			}
		}
		
		for(char ch:counter.keySet())
		{
			if(counter.get(ch)==1)
			{
				System.out.println("Non Repeating Chars: "+ch);
			}
		}
	}
	
	public static void main(String[] args)
	{
		String str= "programmer";
		repeatChar(str);
	}
}
