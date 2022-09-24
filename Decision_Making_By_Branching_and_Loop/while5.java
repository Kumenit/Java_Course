import java.io.*;
class while5{
	public static void main(String[] args)
	{
		String s=null;
		int j=1;
		int sum=1;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter any number");
		try
		{
			s=br.readLine();
		}catch (Exception e){}
		int i=Integer.parseInt(s);
		while(j<i)
		{
			j++;
			sum=sum*j;
		}
		System.out.println("the factorial of"+i+"is:"+sum);
	}
}
		
	
