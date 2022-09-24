class varges{
	public static void display(String ...a)
	{
		System.out.println("list of countrys:");
		System.out.println("number of args is:"+a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}
	}
	public static void main(String[] args)
	{
		display();
		display("india","oromo");
		display("afar");
		display("tigria","usa","canada","kenya");
		display("uk","italy","mexico");
	}
}
		