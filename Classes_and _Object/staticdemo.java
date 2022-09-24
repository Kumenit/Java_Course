class fac{
	static int fin(int n)
	{
		if(n==1 | n==2)
			return 1;
		else return(n*fin(n-1));
	}
	
}
class staticdemo{
		public static int fun(int n)
	{
		int fib;
		if(n==1)fib=0;
		else if(n==2)fib=1;
		else fib=fun(n-1)+fun(n-2);
		return fib;
	}
	public static void main(String[] args)
	{
		int i=fac.fin(5);
		System.out.println("factorial of 5 is:"+i);
		int j=fun(6);
		System.out.println("the 6 term of fobanic is:"+j);
	
	}
}