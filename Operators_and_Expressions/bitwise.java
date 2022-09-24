class bitwise{
	public static void main(String[] args)
	{
		int x=9;
		int y=8;
		int z=-9;
		int r;
		r=x&y;
		System.out.println("x&y:"+r);
		r=x|y;
		System.out.println("x|y:"+r);
		r=~x;
		System.out.println("~x:"+r);
		r=x^y;
		System.out.println("x^y:"+r);
		r=x>>4;
		System.out.println("x>>4:"+r);
		r=y<<3;
		System.out.println("y<<3:"+r);
		r=x>>>1;
		System.out.println("x>>>1:"+r);
		r=z>>>1;
		System.out.println("z>>>1:"+r);
	}
}
		