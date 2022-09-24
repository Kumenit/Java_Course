package pack;
public class square extends quadrilateral{
	public square(double s1,double s2,double s3,double s4)
	{
		super(s1,s2,s3,s4);
	}
	public square(double s)
	{
		s1=s2=s3=s4=s;
	}
	public String toString()
	{
		double area=s1*s1;
		double per=4*s1;
		a="square area";
		b="square per";
		String s=a+"\n"+b+"\n"+"area:"+area+"\n"+"per:"+per;
		return s;
	}
}