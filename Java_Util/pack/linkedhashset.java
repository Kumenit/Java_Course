package pack;
import java.util.*;
public class linkedhashset{
	public static void main(String[] args)
	{
		LinkedHashSet<String> l1=new LinkedHashSet<String>();
		l1.add("india");
		l1.add("usa");
		l1.add("ethio");
		l1.add("england");
		l1.add("sweden");
		l1.add("Russia");
		Iterator<String> i=l1.iterator();
		System.out.println("iteratoring through the set");
		while(i.hasNext());
		System.out.println(i.next()+"\t");
	}
}