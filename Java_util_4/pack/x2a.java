package pack;
import java.util.*;
public class x2a{
	public static void main(String[] args)
	{
		String s="i,and, you,are,best";
		StringTokenizer st=new StringTokenizer(s);
		while(st.hasMoreTokens())
			System.out.println(st.nextToken()+"\t");
		String s1="kome,sofe,genet,desta";
		StringTokenizer st1=new StringTokenizer(s1,",");
		while(st1.hasMoreTokens())
			System.out.println(st1.nextToken()+"\t");
		String s3="i,&you,me&that&it&like";
		StringTokenizer st3=new StringTokenizer(s3,",",true);
		while(st3.hasMoreTokens())
		{
			String sl=st3.nextToken();
		System.out.println(sl);
		if(s.equals("me"))
			System.out.println(st3.nextToken("&"));
		}
		System.out.println("countTokens:"+st.countTokens());
	}
}