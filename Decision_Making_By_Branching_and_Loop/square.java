import java.io.*;
class square{
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
		int j=i*i;
		System.out.println("the squareof"+i+"is:"+j);
	}
}
		
	
