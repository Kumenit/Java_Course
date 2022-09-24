import java.io.*;
class x15{
	public static void main(String[] args)
	{
		String s=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter the first letter of any colour");
		try
		{
			s=br.readLine();
		}catch (Exception e){}
		char i=Character.parseChar(s);
		switch(i)
		{
			case 'v':System.out.println("violet");
				   break;
			case 'i':System.out.println("indigo");
				   break;
			case 'o':System.out.println("orange");
				   break;
			case 'g':System.out.println("green");
			       break;
			case 'b':System.out.println("blue");
			       break;
			case 'r':System.out.println("red");
			       break;
			default :System.out.println("invalid colour");
		}
	}
}	
       
			
			
			
		
	
