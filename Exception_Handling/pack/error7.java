package pack;
import java.io.*;
public class error7{
public static void main(String[] args)
{
	int i;
	String s="0";
	System.out.println("no 0 upto 1");
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	try{
		s=br.readLine();
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
	i=Integer.parseInt(s);
	try{
		if(i==1)
			throw new ArithmeticException("java ArithmeticException using throw keyword");
		if(i==2)
			throw new NegativeArraySizeException("java NegativeArraySizeException using throw keyword");
		if(i==3)
			throw new ArrayIndexOutOfBoundsException("java ArrayIndexOutOfBoundsException using throw keyword");
		if(i==4)
			throw new ArrayStoreException();
	}catch(ArrayIndexOutOfBoundsException e)
	{
		System.out.println(e);
		System.out.println(e.getMessage());
		System.out.println("Hanling java ArithmeticException");
	}
	catch(NegativeArraySizeException e)
	{
		System.out.println(e.getMessage());
		System.out.println("handling java NegativeArraySizeException");
	}
	catch(ArithmeticException e)
	{
		System.out.println(e.getMessage());
		System.out.println("handling java ArithmeticException");
	}
	catch(ArrayStoreException e)
	{
		System.out.println(e);
		System.out.println(e.getMessage());
		System.out.println("handling java ArrayStoreException");
	}
  }
}
