package person;
import java.util.Date;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class PersonService {
	
	private static Person[] perarr;
	private static int cnt;
	
	static {
		perarr = new Person[50];
		perarr[0]=new Person(1,"Sush","7007",new Date());
		perarr[1]=new Person(2,"Sandesh","1234",new Date());
		perarr[2]=new Person(3,"Shailesh","5678",new Date());
		
		cnt=3;
	}
	public static void addnewPerson()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter person id");
		int pid=sc.nextInt();
		System.out.println("Enter person name");
		String pname=sc.next();
		System.out.println("Enter person mobile no");
		String mobile=sc.next();
		System.out.println("Enter birthdate");
		String bdate=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		Date dt=null;
		try {
			dt=sdf.parse(bdate);
		}catch (ParseException e) {
			e.printStackTrace();
		}
		perarr[cnt]=new Person(pid,pname,mobile,dt);
		cnt++;
		
		}
	//display objects till cnt
	public static void displayAll() {
		for(int i=0;i<cnt;i++)
		{
			System.out.println(perarr[i]);
		}
		
		
	}
	//search by id and return object if found otherwise return null
	public static Person searchById(int pid) {
		for(int i=0;i<cnt;i++)
		{
			if(perarr[i].getPid()==pid) {
				return perarr[i];
			}
		}
		return null;
	}
	
	public static int searchbyName(String nm) {
		int cnt1=0;
		for(int i=0;i<cnt1;i++)
		{
			if(perarr[i].getPname().equals(nm)) {
				System.out.println(perarr[i]);
				cnt1++;
			}
		}
		return cnt1;
		
	}
	public static int searchByMonth(int month)
	{
		int cnt1=0;
		for(int i=0;i<cnt1;i++)
		{
			int m=perarr[i].getBdate().getMonth();
			if(m==month) {
				System.out.println(perarr[i]);
				cnt1++;
			}
			
		}
		return cnt1++;
	}

}
