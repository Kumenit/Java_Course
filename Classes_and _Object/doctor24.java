class privat{
	private int a,b;
	public privat(int p,int q)
	{
		a=p;
		b=q;
	}
	private int add()
	{
		return (a-b);
	}
	public int addfun()
	{
		int sum;
		sum=add();
		return (sum+1);
	}
}
class doctor24{
	public static void main(String[] args)
	{
		privat p1=new privat(50,30);
		int i=p1.addfun();
		 System.out.println("the value is:"+i);
		 privat p2=new privat(30,5);
		  i=p2.addfun();
		  System.out.println("the value is:"+i);
	}
}