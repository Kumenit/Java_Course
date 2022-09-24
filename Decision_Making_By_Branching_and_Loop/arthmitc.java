import java.io.*;
class arthmitc{
	public static void main(String[] args)
	{
		int a=0;
		int n=0;
		int d=0;
		String s="0";
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("enter first term");
			s=br.readLine();
			a=Integer.parseInt(s);
			System.out.println("enter the n term");
			s=br.readLine();
			n=Integer.parseInt(s);
			System.out.println("enter common d/f");
			s=br.readLine();
			d=Integer.parseInt(s);
		}catch (Exception e){}
		int i=a+(n-1)*d;
		System.out.println("arthemitc is:"+i);
	}
}
		
	
