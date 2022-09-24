package figpack;
class cylinder extends figure{
	double h;
	public cylinder(double ra,double ha)
	{
		super(ra);
		h=ha;
	}
	public void calcarea()
	{
		a=(2*pi*r*r)+(2*pi*r*h);
	}
	public void calcvolume()
	{
		v=pi*r*r*h;
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