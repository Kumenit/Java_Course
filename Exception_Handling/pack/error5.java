package pack;
import java.io.*;
public class error5{
	public static void main(String[] args)
	{
		int i,k=0,a[],b[];
		String s=new String();
		System.out.println("enter no 1 upto 4");
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
			k=i/(9-i);
         try{
			 if(i==2)
				 a=new int[i-3];
			 if(i==3)
				 i=i/(i-3);
			 if(i==4)
			 {
				 b=new int[1];
				 b[1]=500;
			 }
		 }catch(ArrayIndexOutOfBoundsException e)
		 {
			 System.out.println("array index out of bound");
		 }
		}catch(ArithmeticException e)
		 {
			 System.out.println("cannot divide by 0");
		 }
         catch(	NegativeArraySizeException e)
		 {
System.out.println("array size is negative");
		 }
	}
}
			 
	