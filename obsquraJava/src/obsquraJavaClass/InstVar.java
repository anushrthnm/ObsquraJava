package obsquraJavaClass;
public class InstVar
{
public static void main(String[] args)
{
InstVar var= new InstVar();
var.printvar();
System.out.println(var.age);
}
 int age;
 public void printvar()
 {
   age= 15;
   System.out.println("Age = "+age);
 }

}