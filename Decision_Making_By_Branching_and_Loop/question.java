import java.io.*;
class question{
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
		boolean t=i%2==0?i%4==0:2*i>=10;
		System.out.println("the number"+i+"is even number is"+t);
	}
}
		
	
	
		
	
	
       
			
			
			
		
	
