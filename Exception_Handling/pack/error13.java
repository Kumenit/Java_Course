package pack;
import java.io.*;
public class error13{
	public static void math(int i)throws ArrayIndexOutOfBoundsException,ArithmeticException
	{
		try{
		if(i==1)
		{
			System.out.println("inside meth method");
			System.out.println("this method throws ArithmeticException");
			return;
		}
		if(i==2)
		{
			System.out.println("inside meth method");
			System.out.println("this method throws ArrayIndexOutOfBoundsException");
			throw new ArrayIndexOutOfBoundsException();
		}
		}catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("in catch block");
			System.out.println("ArrayIndexOutOfBoundsException handling");
		}
		catch(ArithmeticException e)
		{
			System.out.println("in the catch block");
			System.out.println("ArithmeticException handling");
		}
		finally{
		System.out.println("in the finally block");
		}
	}
	public static void main(String[] args)
	{
		int i;
		String s=new String();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter any number");
		try{
			s=br.readLine();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		i=Integer.parseInt(s);
		math(i);
		System.out.println("back to main method");
	}
}
			