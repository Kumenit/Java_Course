class tringle{
	double base;
	double height;
	
	void dispvalue()
	{
		System.out.println("t1 base:"+base);
		System.out.println("t1 height:"+height);
	}
}
class x3{
	public static void main(String[] args)
	{
		tringle t1=new tringle();
		t1.base=3;
		t1.height=23;
		tringle t2= new tringle();
		t2.base=12;
		t2.height=7;
		tringle t3=new tringle();
		t3.base=10;
		t3.height=8;
		System.out.println("tringle info");
		t1.dispvalue();
		System.out.println();
		t2.dispvalue();
		System.out.println();
		t3.dispvalue();
		
	}
}
	
 