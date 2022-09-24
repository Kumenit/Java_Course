import java.io.*;
class x1c{
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
		if(i>0 & i<=10)
			System.out.println("the number is b/n 0 and 10");
		else if(i>10 & i<=20)
		System.out.println("the number is b/n 10 and 20");
	    else if(i>20 & i<=30)
			System.out.println("the number is b/n 10 and 30");
		else
		System.out.println("invalid number");
	}
}