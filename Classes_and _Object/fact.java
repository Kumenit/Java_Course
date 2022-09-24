import java.io.*;
class fib{
	static int fun(int n)
	{
		if(n==0 || n==1)
			return 1;
		else return (n*(n-1));
		
	}
}
class fact{
	public static void main(String[] args)
	{
		String s=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter number");
		try{
			s=br.readLine();
		}catch(Exception e){}
		int i=Integer.parseInt(s);
		int j=fib.fun(i);
		System.out.println("fibonacci term is:"+j);
	}
}