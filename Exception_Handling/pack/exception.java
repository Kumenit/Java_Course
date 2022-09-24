package pack;
import java.io.*;
public class exception{
	public static void main(String[] args)
	{
		int i;
		String s=null;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enetr any number");
		try{
			s=br.readLine();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		i=Integer.parseInt(s);
		try{
			if(!(i>0))
				throw new own(i);
		}catch(own e)
		{
			System.out.println("my exception");
		}
	}
}