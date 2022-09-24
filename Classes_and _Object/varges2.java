class varges2{
	public static void display(String b,String ...a)
	{
		System.out.println("the first country is:"+b);
		System.out.println("number of args is:"+a.length);
			System.out.println("thr other args are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}
	}
	public static void main(String[] args)
	{
		System.out.println();
		display("india","oromo");
		System.out.println();
		display("afar");
		System.out.println();
		display("tigria","usa","canada","kenya");
		System.out.println();
		display("uk","italy","mexico");
	}
}
		