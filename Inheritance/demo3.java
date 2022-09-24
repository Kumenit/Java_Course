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
class demo2{
	public static void main(String[] args)
	{
		doctor d1=new doctor(1,"me","I");
		System.out.println("doctor details\n");
		d1.display();
		System.out.println();
		game g1=new game(3,"life","is");
		System.out.println("game details \n");
		g1.c=100;
		g1.calc();
		g1.display();
		System.out.println("salary:"+g1.get());
	}
}
	
		