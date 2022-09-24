import java.io.*;
class ifelseleadder{
	public static void main(String[] args)
	{
		int a=25;
		int b=43;
		String s=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter any number");
		try
		{
			s=br.readLine();
		}catch (Exception e){}
		double d=Double.parseDouble(s);
		if(d>=2*b & d<=3*a)
			System.out.println("very good");
		else if(d>=a+3 & d<b+18)
		System.out.println("good");
	    else if(d<a*37 & d>b*28)
			System.out.println("better");
		else if(d>=(a+b)+(b-a) & d<(a+b)-(a*5))
			System.out.println("improving");
		else if(d<=50)
			System.out.println("poor");
		else
		System.out.println("invalid number");
	}
}