import java.io.*;
class x14{
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
			if(i>=50)
			{
				if(i>=100)
				{
				System.out.println("the batsman has hit a century");
				}
				else
				{
					System.out.println("the batsman has hit a half-century");
				}
			}
			else
			{
					System.out.println("the batsman has not even hit a half-century");
				}
		}
		else
		{
		System.out.println("the batsman score duck");
		}
	}
}