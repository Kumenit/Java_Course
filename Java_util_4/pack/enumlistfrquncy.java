package pack;
import java.util.*;
public class enumlistfrquncy{
	public static void disp(Collection<String> l)
	{
		Iterator<String> i=l.iterator();
		while(i.hasNext())
			System.out.println(i.next()+"\t");
	}
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		Enumeration<String> e=Collections.enumeration(al);
		System.out.println("the value of al");
       while(e.hasMoreElements())
           System.out.println(e.nextElement()+"\t");
	   e=Collections.enumeration(al);
	  ArrayList<String> l=Collections.list(e);
	  System.out.println("after changing e to list");
	  disp(l);
	  System.out.println("the frequncy of a is:"+Collections.frequency(al,"a"));
	}
}
	   