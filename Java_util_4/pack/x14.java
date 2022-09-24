package pack;
import java.util.*;
public class x14{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("that");
		al.add("kome");
		Enumeration<String> e=Collections.enumeration(al);
		while(e.hasMoreElements())
			System.out.println(e.nextElement()+"\t");
		e=Collections.enumeration(al);
		List<String> l=Collections.list(e);
		Iterator<String> i=l.iterator();
		while(i.hasNext())
			System.out.println(i.next()+"\t");
		al.add("kome");
		System.out.println("frequency:"+Collections.frequency(al,"kome"));
		ArrayList<String> l2=new ArrayList<String>();
		al.add("kome");
		System.out.println("common element:"+Collections.disjoint(al,l2));
	}
}
		