package obsquraAssnment;

public class SubstringCount 
{

	public static void counter(String str1, String str2)
	{
		str1=str1.trim();
		str2=str2.trim();

		String[] words=str1.split(str2,-1);
		int count;
		count=words.length-1;

		System.out.println("No: of Times: "+count);
	}
	public static void main(String[] args)
	{
		counter("hjsdfhjdsfusydftesttesttesttestekdkjfjdftestetesttesttest","test");
	}
}
