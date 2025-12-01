package obsquraAssnment;

public class StudDetPgms {

	public static void main(String[] args) 
	{
		GetStudent stud=new GetStudent("Naruto",7);
		GetAddress addr=new GetAddress("Hokage block","Konoha","Konohagakure");
        addr.StudDetails(stud);
	}

}
