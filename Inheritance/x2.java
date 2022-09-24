class figure{
	double r;
	double a;
	double v;
	public void disparea()
	{
		System.out.println("area:"+a);
	}
	public void dispvolume()
	{
		System.out.println("volume:"+v);
	}
}
class cone extends figure{
	double pi=3.14;
	double h;
	double s;
	public void calcarea()
	{
		a=(pi*r*s)+(pi*r*r);
	}
	public void calcvolume()
	{
		v=(pi*r*r*h)/3;
	}
}
class x2{
	public static void main(String[] args)
	{
		cone c=new cone();
		c.r=4;
		c.s=3;
		c.h=6;
		c.calcarea();
		System.out.println("the area of cone is:");
		c.disparea();
		c.calcvolume();
		System.out.println("the volume of cone is:");
		c.dispvolume();
	}
}