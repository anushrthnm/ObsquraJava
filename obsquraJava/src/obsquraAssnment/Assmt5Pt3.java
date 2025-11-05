package obsquraAssnment;
public class Assmt5Pt3
{
  public static void addmatrix(int a[][],int b[][],int c[][])
  {
    for(int i=0;i<a.length;i++)
      {
          for(int j=0;j<a[0].length;j++)
          {
              c[i][j]=a[i][j]+b[i][j];
          }
      }
      for(int i=0;i<c.length;i++)
      {
          for(int j=0;j<c[i].length;j++)
          {
              c[i][j]=a[i][j]+b[i][j];
              System.out.print(c[i][j]+" ");
          }
          System.out.println(""); 
      }
  }
  
  public static void main(String[] args) 
  {
     int[][] a = { {1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4} };
     int[][] b = { {1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4} };
     int[][] c = new int[4][3];
     addmatrix(a,b,c);
  }
}