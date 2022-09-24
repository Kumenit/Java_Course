class figure{
	double calc(int r)
	{
		double pi=3.14;
		return (pi*r*r);
	}
	double calc(double s)
	{
		return (s*s);
	}
	double calc(double b,double h)
	{
		return (b*h)/2;
	}
	double calc(int l,float b)
	{
		return (l*b);
	}
}
class x6{
	public static void main(String[] args)
	{
		figure f1=new figure();
		double a=f1.calc(12);
		double b=f1.calc(12.5);
		double c=f1.calc(2,16.4);
		double d=f1.calc(12,20.5f);
		System.out.println("circle:"+a);
		System.out.println("square:"+b);
		System.out.println("triangle:"+c);
		System.out.println("rectangle:"+d);
	}
}