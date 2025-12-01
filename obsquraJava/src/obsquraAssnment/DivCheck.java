package obsquraAssnment;

public class DivCheck extends AddNum
{
  void divCheck(int a ,int b)
  {
	 int num= super.addNum(a,b);
	 
	 if(num%10==0)
	 {
		 System.out.println(num+" is divisble by 10");
	 }
	 else
	 {
		 System.out.println(num+" is not divisble by 10");
	 }
  }  
  public static void main(String[] args) 
  {
	  DivCheck div=new DivCheck();
	  div.divCheck(10, 20);
  }
  
}
