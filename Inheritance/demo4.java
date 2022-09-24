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
	public doctor(doctor g)
	{
		docid=g.docid;
		docname=g.docname;
		docaddress=g.docaddress;
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
	public game()
	{
		super();
		basic=0;
	}
	public game(int id,String n,String a,double b)
	{
		super(id,n,a);
	    basic=b;
	}
	public game(game g)
	{
	super(g);
	basic=g.basic;
	}
	public void calc()
	{
		a=basic * basic;
		b=(basic+a);
		salary=basic+a+b;
	}
	public double get()
	{
		return salary;
	}
}
class demo4{
	public static void main(String[] args)
	{
		game g1=new game();
		game g2=new game(1,"kome","cmc",50);
		game g3=new game(g2);
		
		System.out.println("game details \n");
		g1.calc();
		g1.display();
		System.out.println("salary:"+g1.get());
		System.out.println();
		g2.calc();
		g2.display();
			System.out.println("salary:"+g2.get());
				System.out.println();
				g3.calc();
				g3.display();
					System.out.println("salary:"+g3.get());
	}
}
	

	
		