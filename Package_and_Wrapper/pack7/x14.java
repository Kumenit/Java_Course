package pack7;
class x14{
	public static void main(String[] args)
	{
		Float f=new Float(0.0/0.0);
		Float f2=new Float(1/0.0);
		System.out.println("isNaN:"+f.isNaN());
		System.out.println("isInfinite:"+f2.isInfinite());
		System.out.println("isNaN:"+f2.isNaN());
		System.out.println("isInfinite:"+f.isInfinite());
	}
}