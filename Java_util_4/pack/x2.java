package pack;
import java.util.*;
public class x2{
	public static void main(String[] args)
	{
		String s="i,&am,&the,&best";
		StringTokenizer st=new StringTokenizer(s);
		System.out.println("a:");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken()+"\t");
		StringTokenizer st1=new StringTokenizer(s,",");
		System.out.println("b:");
		while(st1.hasMoreTokens())
			System.out.println(st1.nextToken()+"\t");
		StringTokenizer st2=new StringTokenizer(s,",");
		System.out.println("the s2:");
		while(st1.hasMoreTokens())
			{
				System.out.println(st2.nextToken());
				if(st2.nextToken().equals("the"))
					System.out.println(st2.nextToken("&"));
			}
			System.out.println("d count"+st.countTokens());
	}
}
		
		