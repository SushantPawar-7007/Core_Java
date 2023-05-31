
public class CmdLineArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int s=0;
		for(int i=0;i<args.length;i++)
		{
			s+=Integer.parseInt(args[i]);
		}
		
		
		System.out.println("Sum="+s);
		

	}

}
