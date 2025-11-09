package obsquraAssnment;

public class AreaPgm 
{
	public double AreaPgm(double leng, double breadth) 
    {
    	double area;
    	area= leng*breadth;
    	return area;
    }
	public double AreaPgm(int leng) 
    {
    	double area;
    	area= leng*leng;
    	return area;
    }
	public double AreaPgm(double leng) 
    {
    	double area;
    	area= 3.14*leng*leng;
    	return area;
    }
	public static void main(String[] args) 
	{
		AreaPgm arr=new AreaPgm();
		System.out.println("Area of circle: "+arr.AreaPgm(10));
		System.out.println("Area of square: "+arr.AreaPgm(5));
		System.out.println("Area of rectangle: "+arr.AreaPgm(10,5));
	}
}
