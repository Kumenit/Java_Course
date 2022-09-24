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
	double a,b,basic;
    double salary;
	public game(int id,String n,String a,double b)
	{
		super(id,n,a);
		basic=b;
	}
	public void calc()
	{
		a=basic*4;
		b=basic*a;
		salary=b+a;
	}
	public double get()
	{
		return salary;
	}
}
class life extends game{
	int l;
	String v;
	public life(int id,String n,String a,int b,String v,int l)
	{
		super(id,n,a,b);
		this.l=l;
		this.v=v;
	}
	public int getl()
	{
		return l;
	}
	public String getv()
	{
		return v;
	}
}
class demo7{
	public static void main(String[] args)
	{
		doctor d1=new doctor(1,"me","I");
		System.out.println("doctor details\n");
		d1.display();
		System.out.println();
		game g1=new game(3,"life","is",500);
		System.out.println("game details \n");
		g1.calc();
		g1.display();
		System.out.println("salary:"+g1.get());
		System.out.println();
		life l1=new life(2,"desta","year",600,"genet",45);
		l1.calc();
		l1.display();
		System.out.println("salary:"+l1.get());
		System.out.println("van name:"+l1.getv());
		System.out.println("van number:"+l1.getl());
	}
}
		
	

	
		