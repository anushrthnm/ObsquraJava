package obsquraAssnment;
public class Assmt5Pt2
{
  public static void linear(int arr[],int n, int el)
  {
      int flag=0;
      for(int i=0;i<n;i++)
      {
         if(arr[i]==el)
         {
             System.out.println("Element "+el+" is found at location "+i);
             flag=1;
         }
      }
      if(flag==0)
      {
          System.out.println("Element not present in array");
      }
  }
  
  public static void main(String[] args) 
  {
      int arr[]= {10,11,12,13,14};
      linear(arr,arr.length,12);
  }
}