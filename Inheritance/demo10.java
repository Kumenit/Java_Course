class quadrilater{
	double s1,s2,s3,s4;
	public quadrilater(double side1,double side2,double side3,double side4)
	{
		s1=side1;
		s2=side2;
		s3=side3;
		s4=side4;
	}
	public double area()
	{
		return -999;
	}
}
class square extends quadrilater{
	public square(double side1,double side2,double side3,double side4)
	{
		super(side1,side2,side3,side4);
	}
	public double area()
	{
		return (s1*s1);
	}
}
class rectangle extends quadrilater{
	public rectangle(double s,double d,double side3,double side4)
	{
		super(side1,side2,side3,side4);
	}
	public double area()
	{
		return (s1*s2);
	}
}
class demo10{
	public static void main(String[] args)
	{
		quadrilater rafvar;
		quadrilater q=new quadrilater(12,3,5,64);
		square s=new square(10,1,2,3);
		rectangle r=new rectangle(21,2,1,2);
		rafvar=q;
		System.out.println("area:"+rafvar.area());
		rafvar=s;
		System.out.println("area:"+rafvar.area());
		rafvar=r;
		System.out.println("area:"+rafvar.area());
	}
}