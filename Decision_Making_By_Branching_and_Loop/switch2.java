import java.io.*;
class switch2{
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
			case -1:
			case -2:
			case -3:System.out.println("the number is negative");
			        break;
			case 1:
			case 2:
			case 3:System.out.println("the number is posative");
			      break;
			case 12:
			case 4:
			case 6:
			case 8:System.out.println("the number is even");
			      break;
			case 13:
 			case 5:
			case 7:System.out.println("the number is odd");
			       break;
			default :System.out.println("invalid number");
		}
	}
}	
       
			
			
			
		
	
