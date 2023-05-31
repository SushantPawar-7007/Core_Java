package practice;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.text.ParseException;

public class DateClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //create date class object and stores todays date
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		// converts the date from java format to string format
		String dt=sdf.format(d);
		System.out.println("Converted Date is:"+dt);
		
		//converts date from user format to java format
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a date in (dd/MM/yyyy) format");
		String sdt=sc.next();
		try {
		
		//parse function converts the string to java date format
		
		Date dt1=sdf.parse(sdt);
		System.out.println("Converted date in java Format");
		System.out.println(dt1);
		}
		catch(ParseException e) {
			System.out.println(e);
		}
		
		sc.close();
		
		
		
		
		
		
	}

}
