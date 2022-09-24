import java.io.*;
class ifdemo1{
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
		if(i%3==0)
		{
			System.out.println("the number"+i+"is divisble by 3");
		}
		System.out.println("the no is divisble by 3");
		System.out.println("the no is not divisble by 3");
	}
}