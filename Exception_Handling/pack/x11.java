package pack;
import java.io.*;
public class x11{
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
	
		try{
				int i=Integer.parseInt(s);
			int a[]=new int[i];
			System.out.println(a[i-1]);
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("array can't be negative");
		}
		catch(NumberFormatException e)
		{
			System.out.println("number format exception");
		}
		
	}
}