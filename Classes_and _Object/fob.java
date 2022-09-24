import java.io.*;
class fib{
	public static int fun(int n)
	{
		int fib;
		if(n==1)fib=0;
		else if(n==2)fib=1;
		else fib=fun(n-1)+fun(n-2);
		return fib;
	}
}
class fob{
	public static void main(String[] args)
	{
		int a;
		String s=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number");
		try{
			s=br.readLine();
		}catch(Exception e){}
		int i=Integer.parseInt(s);
		fib f=new fib();
		a=f.fun(i);
		System.out.println("fibonacci term is:"+a);
	}
}