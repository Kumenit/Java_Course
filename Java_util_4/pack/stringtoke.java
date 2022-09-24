package pack;
import java.util.*;
public class stringtoke{
	public static void main(String[] args)
	{
		String s="i,love,you,you,love,me";
		StringTokenizer st=new StringTokenizer(s,",");
		while(st.hasMoreElements())
		{
			System.out.println(st.nextElement());
		}
	}
}