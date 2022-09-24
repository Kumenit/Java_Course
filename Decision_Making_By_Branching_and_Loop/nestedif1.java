import java.io.*;
class nestedif1{
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
		if(i%2==0)
		{
			if(i%3==0)
			{
				System.out.println("the number"+i+"is true");
			}
			else
			{
				System.out.println("the number"+i+"is false");
			}
		}
		else if(i%4==0)
		{
			System.out.println("the number"+i+"is true");
		}
		else{
		System.out.println("invalid number");
		}
	}
}