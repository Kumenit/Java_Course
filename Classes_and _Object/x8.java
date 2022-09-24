class rectangle{
	double l;
	double b; 
	rectangle()
	{
		l=1;
		b=1;
	}
	rectangle(double i,double k)
	{
		l=i;
		b=k;
	}
	rectangle(rectangle r)
	{
		l=r.l;
		b=r.b;
	}
	void display()
	{
		System.out.println("length:"+l);
		System.out.println("base:"+b);
	}
	double getl(){
		return l;
	}
	double getb()
	{
		return b;
	}
	double getarea(){
		return (l*b);
	}
}
class x8{
	public static void main(String[] args)
	{
		double d;
		double s;
		double a;
		System.out.println("the values");
		rectangle r1=new rectangle();
		r1.display();
		d=r1.getarea();
		System.out.println("area:"+d);
		rectangle r2=new rectangle(5,6);
		r2.display();
		s=r2.getarea();
		System.out.println("area:"+s);
		rectangle r3=new rectangle(r2);
		r3.display();
		a=r3.getarea();
		System.out.println("area:"+a);
		
	}
}