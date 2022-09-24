import java.io.*;
class fib{
	int fun(int n)
	{
		int fib;
		if(n==1)fib=0;
		else if(n==2)fib=1;
		else fib=fun(n-1)+fun(n-2);
		return fib;
	}
}
class reic{
	public static void main(String[] args)
	{
		String s=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number");
		try{
			s=br.readLine();
		}catch(Exception e){}
		Integer y=Integer.parseInt(s);
		int j=y.intValue();
		fib f=new fib();
		int p=f.fun(j);
		System.out.println("fibonacci term is:"+p);
	}
}