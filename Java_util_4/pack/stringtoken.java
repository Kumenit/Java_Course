package pack;
import java.util.*;
public class stringtoken{
	public static void main(String[] args)
	{
		String s1="kome,desta,and,me";
		StringTokenizer s=new StringTokenizer(s1,",");
		while(s.hasMoreTokens())
			System.out.println(s.nextToken()+"\t");
		StringTokenizer st=new StringTokenizer(s1,",",true);
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken()+"\t");
	    }
			System.out.println("number of token is:"+s.countTokens());
			String s2="i,love,you,you&me%that";
			StringTokenizer st1=new StringTokenizer(s2,"&",false);
			while(st1.hasMoreTokens())
			{
				System.out.println(st1.nextToken());
				if(st1.equals("love"))
					System.out.println(st1.nextToken("&"));
			}
	}
}