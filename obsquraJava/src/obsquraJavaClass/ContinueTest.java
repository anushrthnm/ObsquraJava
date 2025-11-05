package obsquraJavaClass;
public class ContinueTest
{
  public static void main(String args[])
  {
    for (int i=0;i<=10;i++)
	{
		if(i==5)
		{
		  System.out.println(i);
		  continue;
		}
		System.out.println(i);
	}
  }
}