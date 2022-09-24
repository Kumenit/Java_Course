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
class x9{
	public static void main(String[] args)
	{
		ademo1 a;
		System.out.println("area & volume");
		cone c=new cone(10,20,15);
		a=c;
		a.calcarea();
		a.calcvolume();
		System.out.println("area & volume of cone");
		a.disparea();
		a.dispvolume();
		sphere s=new sphere(10);
		a=s;
		a.calcarea();
		a.calcvolume();
		System.out.println("area & volume of sphere");
		a.disparea();
		a.dispvolume();
		cylinder d=new cylinder(10,20);
		a=d;
		a.calcarea();
		a.calcvolume();
		System.out.println("area & volume of cylinder");
		a.disparea();
		a.dispvolume();
	}
}