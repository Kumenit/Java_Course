class doctor{
	int docid;
	String docname;
	String docaddress;
	public doctor()
	{
		docid=1;
		docname="sofe";
		docaddress="cmc";
	}
	public doctor(int id,String n,String a)
	{
		docid=id;
		docname=n;
		docaddress=a;
	}
	public void display()
	{
		System.out.println("id:"+docid);
		System.out.println("name:"+docname);
		System.out.println("address:"+docaddress);
	}
}
class game extends doctor{
	double a,b,basic;
    double salary;
	public game(int id,String n,String a,double b)
	{
		docid=id;
		docname=n;
		docaddress=a;
	    basic=b;
	}
	public void calc()
	{
		a=0.5 * basic;
		b=0.5 * ( basic+a);
		salary=basic+a+b;
	}
	public double get()
	{
		return salary;
	}
}
class demo2{
	public static void main(String[] args)
	{
		game g1=new game(3,"life","is",200);
		System.out.println("game details \n");
		g1.calc();
		g1.display();
		System.out.println("salary:"+g1.get());
	}
}
	
		