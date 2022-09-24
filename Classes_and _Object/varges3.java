class varges3{
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
	public static void display(int a,String ...b)
	{
		System.out.println("the first number is:"+a);
		System.out.println("number of args is:"+b.length);
			System.out.println("thr other args are:");
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+"\t");
		}
	}
	public static void display(int ...n)
	{
		System.out.println("number of args is:"+n.length);
			System.out.println("thr other args are:");
		for(int i=0;i<n.length;i++)
		{
			System.out.println(n[i]+"\t");
		}
	}
	public static void display(int n,int p,String ...a)
	{
		System.out.println("the first number is:"+n);
		System.out.println("the second number is:"+p);
		System.out.println("number of args is:"+a.length);
			System.out.println("thr other args are:");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}
	}
	public static void main(String[] args)
	{
		display(10,8,7,15,300);
		System.out.println();
		display(1,"india","oromo");
		System.out.println();
		display(50,30,"true","false");
		System.out.println();
		display("tigria","usa","canada","kenya");
		System.out.println();
		display("uk","italy","mexico");
	}
}
		