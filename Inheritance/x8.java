abstract class ademo1{
	double r;
	double a;
	double v;
	double pi=3.1428;
	public ademo1(double ra)
	{
		r=ra;
	}
	public abstract void calcarea();
	public abstract void calcvolume();
	public abstract void disparea();
	public abstract void dispvolume();
}
class cone extends ademo1{
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
class sphere extends ademo1{
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
class cylinder extends ademo1{
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
class x8{
	public static void main(String[] args)
	{
		System.out.println("area & volume");
		cone c=new cone(10,20,15);
		c.calcarea();
		c.calcvolume();
		System.out.println("area & volume of cone");
		c.disparea();
		c.dispvolume();
		sphere s=new sphere(10);
		s.calcarea();
		s.calcvolume();
		System.out.println("area & volume of sphere");
		s.disparea();
		s.dispvolume();
		cylinder d=new cylinder(10,20);
		d.calcarea();
		d.calcvolume();
		System.out.println("area & volume of cylinder");
		d.disparea();
		d.dispvolume();
	}
}