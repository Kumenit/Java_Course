package pack;
import java.io.*;
public class error11{
	public static void math(int i)throws ArrayIndexOutOfBoundsException,ArithmeticException
	{
		
		if(i==1)
		{
			System.out.println("inside meth method");
			System.out.println("this method throws ArithmeticException");
			throw new ArithmeticException();
		}
		if(i==2)
		{
			System.out.println("inside meth method");
			System.out.println("this method throws ArrayIndexOutOfBoundsException");
			throw new ArrayIndexOutOfBoundsException();
		}
		System.out.println("these statement must be compulsorily printed");
		System.out.println("hi there");
		System.out.println("hello there");
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
		try{
			math(i);
		}catch(ArithmeticException e)
		{
			System.out.println("ArithmeticException handling");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException handling");
		}
	}
}
			