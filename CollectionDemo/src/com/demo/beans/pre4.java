class super
{
	void input()
	{
		int roll, marks;
		String name;
	}
}
class pre4 extends super
{
	void show()
	{
		roll=30; name="Manish"; marks=70;
		System.out.println(roll+" "+name+"  "+marks)
	}
	public static void main(String[]args)
	{
		pre4 r=new pre4();
		r.input();
		r.show();
	}
}