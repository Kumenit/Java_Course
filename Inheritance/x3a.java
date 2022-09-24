class figure{
	double r;
	double a;
	double v;
	public figure(double ra)
	{
		r=ra;
	}
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
	public cone(double ra,double hh,double ss)
	{
		h=hh;
		s=ss;
		r=ra;
		}
	public void calcarea()
	{
		a=(pi*r*s)+(pi*r*r);
	}
	public void calcvolume()
	{
		v=(pi*r*r*h)/3;
	}
}
class x3a{
	public static void main(String[] args)
	{
		cone c=new cone(4,6,3);
		c.calcarea();
		System.out.println("the area of cone is:");
		c.disparea();
		c.calcvolume();
		System.out.println("the volume of cone is:");
		c.dispvolume();
	}
}