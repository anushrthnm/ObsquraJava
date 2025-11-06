package stringpgms;

public class StringExmple {

	public static void main(String[] args) {

	   //using string literals
       String str= "java";
       String str1= "java";
       
       //using new keyword
       String str2 =new String("java");
       String str3 =new String("java");
       
       System.out.println(str==str1);
       System.out.println(str2==str3);
       
       System.out.println(str.equals(str1));
       System.out.println(str1.equals(str2));
       System.out.println(str2.equals(str3));
	}

}
