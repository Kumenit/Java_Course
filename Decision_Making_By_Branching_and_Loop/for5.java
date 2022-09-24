import java.io.*;
class for5{
	public static void main(String[] args)
	{
		int a=0;
		int b=0;
		int c=0;
		int d=0;
		String s="0";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("enter first number");
			s=br.readLine();
			a=Integer.parseInt(s);
			System.out.println("enter second number");
			s=br.readLine();
			b=Integer.parseInt(s);
			System.out.println("enter thired number");
			s=br.readLine();
			c=Integer.parseInt(s);
			System.out.println("enter fourth number");
			s=br.readLine();
			d=Integer.parseInt(s);
		}catch (Exception e){}
		int i=(a+b)*(c+d);
	    for(;i<=100;)
		{
			System.out.println(i);
			i=i+20;
		}
	}
}
		
	
