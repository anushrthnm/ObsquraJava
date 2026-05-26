package obsquraAssnment;

public class ZeroShiftArray 
{
   public static void zeroshifter(int arr[])
   {
	   int nonzero=0;
	   
	   for(int current=0;current<arr.length;current++)
	   {
		   if(arr[current]!=0)
		   {
			   int temp=arr[nonzero];
			   arr[nonzero]=arr[current];
			   arr[current]=temp;
			   nonzero++;
		   }
	   }
	   for(int i=0;i<arr.length;i++)
	   {
		   System.out.println(arr[i]);
	   }
   }
   public static void main(String[] args)
   {
		int arr[]= {1,0,2,0,0,3};
		zeroshifter(arr);
   }
}
