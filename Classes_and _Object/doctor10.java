class add{
	int add(int a,int b)
	{
		return (a/b);
	}
	int add(int a,int b,int c)
	{
		return (a+b*c);
	}
	double add(double a,double b,double c,double d)
	{
		return (a+b)+(c+d);
	}
}
class doctor10{
	public static void main(String[] args)
	{
		int a;
		int b;
		double d;
		
		add d1=new add();
		a=d1.add(12,4);
		b=d1.add(1,2,4);
		d=d1.add(4,3,2,1);
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		System.out.println("d="+d);
	}
}
		