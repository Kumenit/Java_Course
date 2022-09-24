import java.io.*;
class x17a{
	public static void main(String[] args)
	{
		int j=2;
		String s=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter any number");
		try
		{
			s=br.readLine();
		}catch (Exception e){}
		int i=Integer.parseInt(s);
		do{
			j++;
			if(i%j!=0)
			{
				System.out.println("the number is prime");
			}
			else{
				System.out.println("the number is not prime");
			}
		}while(j<=i);
	}
}
		
	
	
		
	
	
       
			
			
			
		
	
