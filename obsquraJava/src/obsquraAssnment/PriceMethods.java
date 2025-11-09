package obsquraAssnment;
public class PriceMethods 
{
	static int price1, price2, price3;
    public static void setPrices(int p1, int p2, int p3) 
    {
        price1 = p1;
        price2 = p2;
        price3 = p3;
    }
    public static int getTotalAmount() 
    {
    	int total;
    	total=price1 + price2 + price3;
        return total;
    }
    public static double getFinalAmount() 
    {
        int totalamt = getTotalAmount();
        if (totalamt > 5000) 
        {
            return totalamt - (totalamt * 0.20);
        } 
        else 
        {
            return totalamt;
        }
    }
	public static void main(String[] args) 
	{
        setPrices(2000, 1500, 1800);
        double finalAmount = getFinalAmount();
        System.out.println("Final Amount to Pay = " + finalAmount);
	}
}
