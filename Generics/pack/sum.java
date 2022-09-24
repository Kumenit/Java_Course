package pack;
public class sum<T extends Number>{
	T a[];
	public sum(T a[])
	{
		this.a=a;
	}
	public double sq()
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
	public boolean isequal(sum<?> s)
	{
		if(sq()==s.sq())
		return true;
	else
		return false;
	}
}