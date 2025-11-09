package obsquraAssnment;

public class PalinNum {
	
	public static int reverse(int num)
	{
		int rev = 0;
		while (num > 0) 
	      {
	            rev = rev * 10 + num % 10;
	            num = num / 10;
	      }
		return rev;
	}
	
	public static void palinCheck(int num1, int num2)
	{
		if(num1==num2)
		{
			System.out.println(num1+" and "+num2+" are palindromes");
		}
		else
		{
			System.out.println(num1+" and "+num2+" are not palindromes");
		}
	}

	public static void main(String[] args) 
	{
       int numb =121;
       palinCheck(numb,reverse(numb));
	}

}
