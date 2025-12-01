package obsquraAssnment;

public class BankClass 
{
    private int pin;   
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	public boolean validPin(int pin)
	{
		this.pin=pin;
		if (pin == 1001 || pin == 1234 || pin == 1212)
		{
			System.out.println("Valid PIN");
			return true;
		}
		else
		{
			System.out.println("Invalid PIN");
			return false;
		}
	}
}
