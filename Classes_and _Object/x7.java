class rectangle{
	int weadth;
	int height;
	
	void set(int w,int d)
	{
		weadth=w;
		height=d;
	}
	int getweadth()
	{
		return weadth;
	}
	int getheight()
	{
		return height;
	}
	boolean checkrect(rectangle r)
	{
		if(weadth=r.getweadth() & height=r.getheight())
		{
		return (true);}
		else{
		return (false);}
	}
}
class x7{
	public static void main(String[] args)
	{
		rectangle r1=new rectangle();
		r1.set(32,44);
		rectangle r2=new rectangle();
		r2.set(32,44);
		rectangle r3=new rectangle();
		r3.set(43,53);
		rectangle r4=new rectangle();
		r4.set(32,12);
		r1.checkrect(r2);
		System.out.println();
		r1.checkrect(r3);
		System.out.println();
		r2.checkrect(r4);
		
	}
}
	
 