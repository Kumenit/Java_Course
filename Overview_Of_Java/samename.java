class samename{
	public static void main(String[] args)
	{
		int a=10;
		System.out.println("outer block");
		System.out.println("a:"+a);
		{
			System.out.println("inner block");
			int d=50;
	        System.out.println("d:"+d);
			//int a=15;
			{
				System.out.println("second inner block");
				String b="game";
				System.out.println("b:"+b);
				//int a=600;
			}
		}
	}
}