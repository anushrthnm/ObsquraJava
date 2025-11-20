package aggregation;

public class Book {
	
	String bookname;
	int number;
	Author a;
	
	public Book(String bookname,int number,Author a)
	{
		this.bookname=bookname;
		this.number=number;
		this.a=a;
	}
	
	public void print()
	{
		System.out.println("Name of book is: "+bookname);
		System.out.println("Book number is: "+number);
		a.display();
	}

	public static void main(String[] args) 
	{
		Author ath=new Author("Herman Hesse",682023);
		Book bk=new Book("Siddhartha",12345,ath);
		bk.print();
	}

}
