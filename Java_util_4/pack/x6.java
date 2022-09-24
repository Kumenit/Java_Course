package pack;
import java.util.*;
public class x6{
	public static void main(String[] args)
	{
		int l[]={1,2,3,4,5};
		doc d=new doc(l);
		Arrays.fill(d,3);
		for(int i=0;i<l.length;i++)
			System.out.println(d[i]+"\t");
	}
}