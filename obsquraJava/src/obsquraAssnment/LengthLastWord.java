package obsquraAssnment;

public class LengthLastWord 
{
    public static void lastWordLength(String str)
    {
    	str = str.trim();
        String[] words = str.split(" ");
        String lastWord = words[words.length - 1];
      	System.out.println("Length of last word:"+lastWord.length());    	
    }
    
    public static void main(String[] args)
    {
    	lastWordLength("Test my skills");
    	lastWordLength("Hello World");
    }
}
