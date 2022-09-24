import java.io.*;
class xz{
	public static void main(String[] args)
	{
		String s=null;
		int i,on,r,re=0;
		on=i;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter any number");
		try
		{
			s=br.readLine();
		}catch (Exception e){}
		int d=Integer.parseInt(s);
		while(on!=0)
		{
			r=on%10;
			re+=math.pow(r,3);
			on/=10;
		}
		if(re==i)
		{
			System.out.println("the number is armsterong");
		}
		else
		{
			System.out.println("not armsterong");
		}
	}
}
		
	
