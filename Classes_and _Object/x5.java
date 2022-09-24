class tringle{
	double base;
	double height;
	
	void set(double b,double d)
	{
		base=b;
		height=d;
	}
	
	void dispvalue()
	{
		System.out.println("t1 base:"+base);
		System.out.println("t1 height:"+height);
	}
	double calcArea()
	{
		return (0.5*base*height);
	}
}
class x5{
	public static void main(String[] args)
	{
		double area;
		tringle t1=new tringle();
		t1.set(5,7);
		area=t1.calcArea();
		System.out.println("area:"+area);
		tringle t2= new tringle();
		t2.set(8,9);
		area=t2.calcArea();
		System.out.println("area:"+area);
		tringle t3=new tringle();
		t3.set(10,11);
		area=t3.calcArea();
		System.out.println("area:"+area);
		System.out.println("tringle info");
		t1.dispvalue();
		
		System.out.println();
		t2.dispvalue();
		
		System.out.println();
		t3.dispvalue();
		
		
	}
}
	
 