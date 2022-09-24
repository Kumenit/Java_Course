package pack;
import java.io.*;
public class x{
	public static void main(String[] args)
	{
		String s=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter any number");
		try{
			s=br.readLine();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		int j=Integer.parseInt(s);
			int fib(j);
			{
			int k;
			if(j==1)k=0;
			else if(j==2)k=1;
		else k=fib(j-1)+fib(j-2);
			System.out.println(k);
		}
	}
}