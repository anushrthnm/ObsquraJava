package obsquraAssnment;

public class DupChar 
{
  public static void main(String[] args)
  {
	  String word="TestTours";
	  
	  //Repeating
	   for(int i=0;i< word.length();i++)
	  {
		  for(int j=i+1;j< word.length();j++)
		  {
			  if(word.charAt(i)==(word.charAt(j)))
			  {
				  System.out.println(word.charAt(i));
			  }
			  
		  }
	  }
	   
	   //Non-repeating
	   for (Character ch : word.toCharArray()) {
           if (word.indexOf(ch) == word.lastIndexOf(ch)) {
        	   System.out.println(ch);
           }
       }
	   
	   //Repeating
	   for (Character ch : word.toCharArray()) {
           if (word.indexOf(ch) != word.lastIndexOf(ch)) {
        	   System.out.println(ch);
           }
       }
  }
}
