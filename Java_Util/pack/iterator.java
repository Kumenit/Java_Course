package pack;
import java.util.*;
public class iterator{
	public static void main(String[] args)
	{
		ArrayList<String> ad=new ArrayList<String>();
		ad.add("usa");
		ad.add("ethio");
		ad.add("england");
		ad.add("sweden");
		ad.add("Russia");
		System.out.println("the content of list is:"+ad);
		Iterator<String> i=ad.iterator();
		while(i.hasNext())
		{
			String s=i.next();
			if(s.equalsIgnoreCase("usa"))
			i.remove();
		}
		System.out.println("after removeing usa");
		System.out.println(ad);
	}
}
		