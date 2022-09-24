class figure{
	double r;
	double a;
	double v;
	public figure(double ra)
	{
		r=ra;
	}
	public figure()
	{
	r=1;
	}
	public figure(figure c)
	{
		r=c.r;
	}
	
		
	public void display()
	{
		System.out.println("area:"+a);
		System.out.println("volume:"+v);
	}
}
class cone extends figure{
	double pi=3.14;
	double h;
	double s;
	public cone()
	{
		super();
		s=5;
		h=6;
	}
	public cone(cone c)
	{
		super(c);
		s=c.s;
		h=c.h;
	}
	
	public cone(double ra,double hh,double ss)
	{
	    super(ra);
		s=ss;
		h=hh;
		}
	public void calc()
	{
		a=(pi*r*s)+(pi*r*r);
		v=(pi*r*r*h)/3;
	}
}
class x5{
	public static void main(String[] args)
	{
		cone c1=new cone();
		cone c2=new cone(4,6,3);
		cone c3=new cone(c2);
		c1.calc();
		System.out.println("the area & volume of cone are:");
		c1.display();		
		c2.calc();
		System.out.println("the area & volume of c2 cone are:");
		c2.display();
		c3.calc();
		System.out.println("the area & volume of c3 cone are:");
		c3.display();
		
	}
}