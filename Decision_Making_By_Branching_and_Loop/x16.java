import java.io.*;
class x16{
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
		int k=i>0?i:i*-1;
		System.out.println("the absolute value of"+i+"is"+k);
	}
}
		
	
	
		
	
	
       
			
			
			
		
	
