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
}
class x4{
	public static void main(String[] args)
	{
		tringle t1=new tringle();
		t1.set(5,7);
		tringle t2= new tringle();
		t2.set(8,9);
		tringle t3=new tringle();
		t3.set(10,11);
		System.out.println("tringle info");
		t1.dispvalue();
		System.out.println();
		t2.dispvalue();
		System.out.println();
		t3.dispvalue();
		
	}
}
	
 