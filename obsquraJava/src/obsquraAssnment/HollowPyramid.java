package obsquraAssnment;

public class HollowPyramid 
{
	    public static void pyramid(int n)
	    {
	        for(int i = 1; i <= n; i++)
	        {
	            for(int j = 1; j <= i; j++)
	            {
	                if(j == 1 || j == i || i == n)
	                {
	                    System.out.print(" "+j+" ");
	                }
	                else
	                {
	                    System.out.print("   ");
	                }
	            }

	            System.out.println("  ");
	        }
	    }
	    public static void starpyramid(int n)
	    {
	        for(int i = 1; i <= n; i++)
	        {
	            for(int j = 1; j <= i; j++)
	            {
	                if(j == 1 || j == i || i == n)
	                {
	                    System.out.print(" "+"*"+" ");
	                }
	                else
	                {
	                    System.out.print("   ");
	                }
	            }

	            System.out.println("  ");
	        }
	    }
	    public static void main(String[] args)
	    {
	        pyramid(7);
	        starpyramid(7);
	    }
}
