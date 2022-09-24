interface cdemo{
	double pi=3.14;
	double area();
	double crcum();
}
class circle implements cdemo{
	int r;
	public circle(int rr)
	{
		r=rr;
	}
	public double area()
	{
		return(pi*r*r);
	}
	public double crcum()
	{
		return(2*pi*r);
	}
}
class demo16{
	public static void main(String[] args)
	{
		System.out.println("\n circle");
		circle c=new circle(4);
		System.out.println("area:"+c.area());
		System.out.println("circumfranc:"+c.crcum());
	}
}