class doctor{
	int docid;
	String docname;
	String docaddress;
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
	double a,b,c;
    double salary;
	public game(int id,String n,String a,double b)
	{
		super(id,n,a);
		c=b;
}
	public void calc()
	{
		a=c*c;
		b=a+c;
		salary=c+b+a;
	}
	public double get()
	{
		return salary;
	}
}
class demo6{
	public static void main(String[] args)
	{
		doctor r;
		doctor d1=new doctor(1,"me","I");
		System.out.println("doctor details\n");
		r=d1;
		r.display();
		System.out.println();
		game g1=new game(3,"life","is",50);
		System.out.println("game details \n");
		r=g1;
		g1.c=100;
		g1.calc();
		r.display();
		System.out.println("salary:"+g1.get());
	}
}
	
		