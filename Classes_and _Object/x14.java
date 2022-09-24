class static1{
	String a="like";
	static class doctor{
		static void display()
		{
			static1 s1=new static1();
			String l=s1.a;
			System.out.println("the value is:"+l);
		}
		public static void get()
		{
			doctor.display();
		}
}
}
class x14{
	public static void main(String[] args)
	{
	static1 s3=new static1();
	s3.get();
	}
}