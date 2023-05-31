package person;
import java.util.Date;
import java.text.SimpleDateFormat;


public class Person {
      private int pid;
      private String pname;
      private String mobile;
      private Date bdate;
      
      
      public Person() {
    	  //calling paramaterized constructor of same type
    	  this.pid=0;
    	  this.pname=null;
    	  this.mobile=null;
    	  this.bdate=null;
    	  
      }
      
      public Person(int id,String name, String m, Date bdt) {
    	  pid=id;
    	  pname=name;
    	  mobile=m;
    	  bdate=bdt;
      }

	/**
	 * @return the pid
	 */
	public int getPid() {
		return pid;
	}

	/**
	 * @param pid the pid to set
	 */
	public void setPid(int pid) {
		this.pid = pid;
	}

	/**
	 * @return the pname
	 */
	public String getPname() {
		return pname;
	}

	/**
	 * @param pname the pname to set
	 */
	public void setPname(String pname) {
		this.pname = pname;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the bdate
	 */
	public Date getBdate() {
		return bdate;
	}

	/**
	 * @param bdate the bdate to set
	 */
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String dt=sdf.format(bdate);
		
		return "Person [pid=" + pid + ", pname=" + pname + ", mobile=" + mobile + ", bdate=" + dt + "]";
	}
      
	
}
