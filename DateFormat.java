import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;
public class DateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Date d=new Date();
		System.out.println(d);
		//create date java format to string format
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		
		String dt=sdf.format(d);
        System.out.println("changed Date Format is:"+dt);	
        
        //create date string format to java frmat
        
        System.out.println("Enter date in the format (dd/MM/yyyy)");
        Scanner sc=new Scanner(System.in);
        String sdt=sc.next();
        try {
        	Date d1=sdf.parse(sdt);
        	System.out.println("converted Date in java Format");
        	System.out.println(d1);
        	
        }catch (ParseException p)
        {
        	System.out.println(p);
        }
	}

}
