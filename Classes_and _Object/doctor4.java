class doctor{
	int add(int a,int b)
	{
		return (a+b);
	}
	float add(float a,float b)
	{
		return (a-b);
	}
	int add(int a,int b,int c)
	{
		return (a+b-c);
	}
	double add(double a,double b,double c,double d)
	{
		return (a+b)/(c+d);
	}
}
class doctor4{
	public static void main(String[] args)
	{
		int a;
		float b;
		int c;
		double d;
		
		doctor d1=new doctor();
		a=d1.add(12,4);
		b=d1.add(13f,12f);
		c=d1.add(2,3,1);
		d=d1.add(4,3,2,1);
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("c="+c);
		System.out.println("d="+d);
	}
}
		