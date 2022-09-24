package pack;
import java.util.*;
public class x2{
	public static void main(String[] args)
	{
		String s="i,&am,&the,&best";
		StringTokenizer<String> st=new StringTokenizer<String>(s);
		System.out.println("a:");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken()+"\t");
		StringTokenizer<String> st1=new StringTokenizer<String>(s,",");
		System.out.println("b:");
		while(st1.hasMoreTokens())
			System.out.println(st1.nextTokens()+"\t");
		StringTokenizer<String> st2=new StringTokenizer<String>(s,",");
		while(st2.hasMoreTokenes())
			if(st2.nextTokenes().equals("the"));
			{
		       System.out.println(s2.nextToken("&"));
			}
			System.out.println(s2.nextToken()+"\t");
			System.out.println("d count"+st.countToken());
	}
}
		
		