package obsquraJavaClass;
public class ObjCreate
{
public static void main(String[] args)
{
  ObjCreate obj=new ObjCreate();
  obj.sum();
  obj.printText("Word");
}

public void sum()
{
 System.out.println("First Method");
}
public void printText(String text)
{
 System.out.println("Text is = "+text);
}
}