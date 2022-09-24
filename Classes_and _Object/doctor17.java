class static1{
	static int count;
	public static1()
	{
		count++;
	}
}
class doctor17{
	public static void main(String[] args)
	{
		System.out.println("count before:"+static1.count);
		static1 s1=new static1();
		static1 s2=new static1();
		static1 s3=new static1();
		System.out.println("count after:"+static1.count);
	}
}