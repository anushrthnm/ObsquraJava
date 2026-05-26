package obsquraAssnment;

public class MissingSum 
{
   
	public static void missing(int num[])
	{
		int n= num.length+1;
		int expsum=n*(n+1)/2;
		int actsum=0;
		int miss;
		
		for(int value : num)
        {
            actsum += value;
        }
		miss=expsum-actsum;
		System.out.println("Missing number is:"+miss);
	    
	}
	public static void main(String[] args)
	{
		int array[]= {1,2,3,4,5,6,7,9};
		missing(array);
	}
}
