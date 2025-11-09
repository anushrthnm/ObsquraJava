package obsquraAssnment;

public class AvgPgm 
{
	public float AvgPgm(float ent1, float ent2, float ent3) 
    {
		float average;
		average= (ent1+ent2+ent3)/3;
    	return average;
    }
	public int AreaPgm(int ent1, int ent2, int ent3) 
    {
		int average;
		average= (ent1+ent2+ent3)/3;
    	return average;
    }
	public static void main(String[] args) 
	{
		AvgPgm avg=new AvgPgm();
		System.out.println("Average of int: "+avg.AvgPgm(10.5f,11.5f,12.5f));
		System.out.println("Area of float: "+avg.AvgPgm(10,11,12));
	}
}
