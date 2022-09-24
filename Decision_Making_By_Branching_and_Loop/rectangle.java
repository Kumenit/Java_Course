import java.io.*;
class rectangle{
	public static void main(String[] args)
	{
		int w=0;
		int l=0;
		String s=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		try
		{
			System.out.println("enter the length");
			s=br.readLine();
			l=Integer.parseInt(s);
			System.out.println("enter the width");
			s=br.readLine();
			w=Integer.parseInt(s);
		}catch (Exception e){}
		int area=l*w;
		System.out.println("the area is:"+area);
	}
}
		
	
