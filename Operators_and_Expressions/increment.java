class increment{
	public static void main(String[] args)
	{
		int x=43;
		int y=10;
		int a,b,c,d;
		
		a=x++;
		b=++y;
		System.out.println("a:"+a);
		System.out.println("b:"+b);
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		
		c=--a;
		d=b--;
		System.out.println("c:"+c);
		System.out.println("d:"+d);
		System.out.println("a:"+a);
		System.out.println("b:"+b);
	}
}