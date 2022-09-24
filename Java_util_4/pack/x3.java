package pack;
import java.util.*;
public class x3{
	public static void main(String[] args)
	{
		Double d[]={3.11,2.33,4.00,7.68,2.36};
		Arrays.sort(d);
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]+"\t");
		}
		int l[]={2,3,1,5,89,3,4,};
			Arrays.sort(l,2,4);
		for(int i=0;i<l.length;i++)
		{
			System.out.println(l[i]+"\t");
		}
	}
}