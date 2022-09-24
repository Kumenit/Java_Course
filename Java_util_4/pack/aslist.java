package pack;
import java.util.*;
public class aslist{
	public static void main(String[] args)
	{
		Integer a[]={1,2,3,4,5};
		List<Integer> l=Arrays.asList(a);
		Iterator<Integer> i=l.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next()+"\t");
		}
	}
}