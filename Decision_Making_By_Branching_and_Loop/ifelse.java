import java.io.*;
class ifelse{
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
		if(i<100)
		{
			System.out.println("the number"+i+"is true");
		}
		else
		{
			System.out.println("the number"+i+"is false");
		}
	}
}