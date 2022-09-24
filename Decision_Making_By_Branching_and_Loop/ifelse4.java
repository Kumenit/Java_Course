import java.io.*;
class ifelse4{
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
		if(i<=0)
		{
			System.out.println("the number"+ i +"is negative");
		}
		else
		{
			System.out.println("the number"+i+"is positive");
		}
	}
}