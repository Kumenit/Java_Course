package figpack;
class sphere extends figure{
	public sphere(double ra)
	{
		super(ra);
	}
	public void calcarea()
	{
		a=(4*pi*r*r);
	}
	public void calcvolume()
	{
		v=(4*pi*r*r*r)/3;
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