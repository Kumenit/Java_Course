package figpack;
class cone extends figure{
	double h;
	double s;
	public cone(double ra,double ha,double sa)
	{
		super(ra);
		h=ha;
		s=sa;
	}
	public void calcarea()
	{
		a=(pi*r*s)+(pi*r*r);
	}
	public void calcvolume()
	{
		v=(pi*r*r*h)/3;
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