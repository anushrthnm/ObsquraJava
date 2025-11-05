package obsquraJavaClass;
public class MethodOverStatic
{
public static void main(String[] args)
{
   sum();
   sum(3,4);
   sum("Naruto",33);
   sum(33,"Naruto");
}
public static void sum()// No param
{
 System.out.println("First Method");
}
public static void sum(int a, int b)//2 params
{
 System.out.println("Sum is = "+(a+b));
}
public static void sum(String a, int b)//2 diff params
{
 System.out.println("Name = "+a);
 System.out.println("Age = "+b);
}
public static void sum(int b,String a)// 2 diff param with diff order
{
 System.out.println("Age = "+b);
 System.out.println("Name = "+a);
}

}