package pack;
import java.io.*;
public class error10{
	public static void meth(int i)throws ArithmeticException,ArrayIndexOutOfBoundsException,ArrayStoreException
	{
		if(i==1)
		{
			System.out.println("i=1");
			System.out.println("throws ArithmeticException...");
			throw new ArithmeticException();
		}
		if(i==2)
		{
			System.out.println("i=2");
			System.out.println("throws ArrayIndexOutOfBoundsException");
			throw new ArrayIndexOutOfBoundsException();
		}
		if(i==3)
		{
			System.out.println("i=3");
			System.out.println("throws ArrayStoreException...");
			throw new ArrayStoreException();
		}
	}
	public static void main(String[] args)
	{
		int i;
		String s=null;
		System.out.println("1 upto 4");
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try{
			s=br.readLine();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		i=Integer.parseInt(s);
		try{
			meth(i);
		}catch(ArithmeticException e)
		{
			System.out.println("handling ArithmeticException thrown");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handling ArrayIndexOutOfBoundsException thrown");
		}
		catch(ArrayStoreException e)
		{
			System.out.println("handling ArrayStoreException thrown");
		}
	}
}
   
