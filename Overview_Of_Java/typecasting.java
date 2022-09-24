class typecasting{
	public static void main(String[] args)
	{
		byte b=12;
		short s=200;
		int i=40000;
		double d=600.785;
		b=(byte)s;
		System.out.println("the value of b is:"+b);
		b=(byte)i;
		System.out.println("the value of b is:"+b);
		b=(byte)d;
		System.out.println("the value of b is:"+b);
	}
}