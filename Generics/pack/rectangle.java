package pack;
public class rectangle extends quadrilateral{
		public rectangle(double s1,double s2,double s3,double s4)
	{
		super(s1,s2,s3,s4);
	}
	public rectangle(double s1,double s2)
	{
		this.s1=s1;
		this.s2=s2;
		s3=s1;
		s4=s2;
	}
	public String toString()
	{
		double area=s1*s2;
		double per=2*(s1+s2);
		a="rectangle area";
		b="rectangle per";
		String s=a+"\n"+b+"\n"+"area:"+area+"\n"+"per:"+per;
		return s;
	}
}