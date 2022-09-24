package pack;
public class d<T extends Number>{
	T a[];
	public d(T a[])
	{
		this.a=a;
	}
	public double sum()
	{
		double sum=0.0;
		for(int i=0;i<a.length;i++)
		{
			double d=a[i].doubleValue();
			d=d*d;
			sum=d+sum;
		}
		return sum;
	}
}