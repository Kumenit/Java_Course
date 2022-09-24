import java.io.*;
class ifelseleadder2{
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
		if(i>0)
			System.out.println("the value is postive");
		else if(i<0)
		System.out.println("the value is negative");
	    else if(i%2==0)
			System.out.println("the valu is even");
		else if(i%5==0)
			System.out.println("the value is divisble by 5");
		else
		System.out.println("invalid number");
	}
}