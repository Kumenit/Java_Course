import java.io.*;
class x9{
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
		if(i%5==0)
		{
			System.out.println("the number is divisble by 5");
		}
		else
		{
		System.out.println("the number is not divisble by 5");
		}
	}
}