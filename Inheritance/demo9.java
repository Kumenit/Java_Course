class doctor{
	int docid;
	String docname;
	String docaddress;
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
	public void display()
	{
		super.display();
		System.out.println("basic payment:"+basic);
		System.out.println("double payment:"+a);
		System.out.println("4th payment:"+b);
		System.out.println("salary:"+salary);
	}
}
class demo9{
	public static void main(String[] args)
	{
		doctor d1=new doctor();
		d1.docid=3;
		d1.docname="life";
		d1.docaddress="cmc";
		System.out.println("doctor details\n");
		d1.display();
		System.out.println();
		game g1=new game();
		g1.docid=2;
		g1.docname="kome";
		g1.docaddress="garment";
		g1.basic=1000;
		System.out.println("game details \n");
		g1.calc();
		g1.display();
	}
}
	
		