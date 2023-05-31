package practice;

public class TestArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int s=0;
		for(int i=0;i<args.length;i++)
		{
			s+=Integer.parseInt(args[i]);
		}
          System.out.println("Sum="+s);
          
         float x=(float)123.78;
         float y=(float)1234523.87;
         
         System.out.println(x);
         System.out.println(y);
         //System.out.println(x);
         //System.out.println(y);
         //System.out.println();
         System.out.printf("%10.2f\n",x);
         System.out.printf("%10.2f",y);
	}

}
