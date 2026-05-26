package obsquraAssnment;

public class AlphabetPyramid 
{
	public static void alphapyramid(int n)
    {
		int alpha=65;
		
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                  System.out.print((char)alpha+"  ");
            }
            alpha++;
            System.out.println("  ");
        }
    }
	public static void alphapyramid2(int n)
    {
		int alpha=65;
		
        for(int i = 0; i <= n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                  System.out.print((char)(alpha+j)+"   ");
            }
            System.out.println("  ");
        }
    }
	public static void main(String[] args)
    {
		alphapyramid(7);
		alphapyramid2(7);
    }
}
