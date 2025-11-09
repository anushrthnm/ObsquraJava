package obsquraAssnment;

public class RevConstr {
	int num;	
    int rev; 
	public RevConstr(int num)
	{
		this.num=num;
	      int revnum = 0;
	      while (num > 0) 
	      {
	    	  revnum = revnum * 10 + num % 10;
	            num = num / 10;
	      }
	      this.rev=revnum;
	}
	public void RevConstr()
	{
		System.out.println("Finding reverse…");
	}
	public static void main(String[] args) 
	{
		RevConstr obj= new RevConstr(1341);
		System.out.println("Original number: " + obj.num);
        System.out.println("Reversed number: " + obj.rev);
	}
}
