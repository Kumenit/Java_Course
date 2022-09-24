class even{
	static int fact(int n)
	{
		if(n%2==0)
			return 1;
		else return 0;
	}
	public static void main(String[] args)
	{
		int i=even.fact(6);
		System.out.println("i="+i);
		int j=even.fact(7);
		System.out.println("j="+j);
	}
}