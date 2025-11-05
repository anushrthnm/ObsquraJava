package obsquraJavaClass;
public class MultiArray2
{
 public static void main(String[] args)
 {
   int arr[][]=new int[2][3];
   arr[0][0]=10;
   arr[0][1]=10;
   arr[0][2]=10;
   arr[1][0]=10;
   arr[1][1]=10;
   arr[1][2]=10;   
   
   for(int i=0;i<=1;i++)
   {
   for(int j=0;j<=2;j++)
   {
     System.out.println(arr[i][j]+ "");
   }
   System.out.println();
   }
 }
 }