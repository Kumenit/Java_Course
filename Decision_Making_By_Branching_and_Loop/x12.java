import java.io.*;
class x12{
	public static void main(String[] args)
	{
		String s=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter hour of a day");
		try
		{
			s=br.readLine();
		}catch (Exception e){}
		double d=Double.parseDouble(s);
		if(d>=0 & d<12)
			System.out.println("good morning");
		else if(d>=12 & d<18)
		System.out.println("good afternooon");
	    else if(d>=18 & d<24)
			System.out.println("good evening");
		else
		System.out.println("time is out of range");
	}
}