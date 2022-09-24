package pack;
public class main13{
	public static void main(String[] args)
	{
		Integer i=new Integer(12);
		raw r=new raw(i);
		raw<Double> r1=new raw<Double>(1.2);
		int l=(Integer)r.get();
		System.out.println("l="+l);
		r1=r;
		l=r1.get();
		System.out.println("l="+l);
		r=r1;
		double d=(Double)r.get();
		System.out.println("d="+d);
	}
}