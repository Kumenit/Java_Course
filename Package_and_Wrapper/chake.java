class chake{
	public static void main(Sttring[] args)
	{
		byte b;
		String a;
		Byte d;
		public static Byte valueOf(byte b)
		{
			return b;
		}
		public static String toString(String s)
		{
			return s;
		}
		Byte b1=new Byte(30);
		Byte b2=new Byte("20");
		b=b1.byteValue();
		System.out.println("b1 valu is:"+b);
		b=b2.byteValue();
		System.out.println("b2 value is:"+b);
		d=b1.valueOf(30);
		System.out.println("d="+d);
		a=b2.toString("20");
		System.out.println("a="+a);
	}
}