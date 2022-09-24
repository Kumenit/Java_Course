import java.io.*;
class nestedif{
	public static void main(String[] args)
	{
		String s=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter any number");
		try
		{
			s=br.readLine();
		}catch (Exception e){}
		int i=Integer.parseInt(s);
		if(i>0)
		{
			if(i%2==0)
			{
				System.out.println("the value is posative even number");
			}
			else
			{
				System.out.println("the value is posative odd number");
			}
		}
		else if(i<0)
		{
			System.out.println("the value is negative number");
		}
		else{
		System.out.println("invalid number");
		}
	}
}