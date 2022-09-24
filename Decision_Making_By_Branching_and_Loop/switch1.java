import java.io.*;
class switch1{
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
		switch(i)
		{
			case 1:System.out.println("month is septamber");
			       System.out.println("first day of school");
				   break;
			case 2:System.out.println("month is octobor");
			       System.out.println("result of exam");
				   break;
			case 3:	System.out.println("month is decamber");
			       System.out.println("rest time");
				   break;
			default :System.out.println("invalid number");
		}
	}
}	
       
			
			
			
		
	
