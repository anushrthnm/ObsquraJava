package obsquraAssnment;

public class nameAge 
{
	 static String name;
	 static int age;
	    public static void setDetails(String n, int a) {
	        name = n;
	        age = a;
	    }
	    public static void getDetails() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	    }
	    public static void main(String[] args) 
	    {
	    	String name="Naruto";
	    	int age= 33;
	        setDetails(name,age);
	        getDetails();
	    }
}
