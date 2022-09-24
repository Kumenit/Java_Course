package figpack;
abstract class figure{
	double r;
	double a;
	double v;
	double pi=3.1428;
	public figure(double ra)
	{
		r=ra;
	}
	public abstract void calcarea();
	public abstract void calcvolume();
	public abstract void disparea();
	public abstract void dispvolume();
}