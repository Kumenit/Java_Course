class promotion{
	public static void main(String[] args)
	{
		byte b=6;
		short s=20000;
		int i=b*s;
		System.out.println("b*s is:"+i);
		long l1=983456789;
		long l2=l1+b+s+i;
		System.out.println("l1+b+s+i is:"+l2);
		float f1=2.5f;
		float f2=f1+b+s+l2;
	    System.out.println("f1+b+s+l2 is:"+f2);
		double d1=2.59678;
		double d2=d1*f2+s+b+l2;
		System.out.println("finall:"+d2);
	}
}