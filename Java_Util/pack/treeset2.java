package pack;
import java.util.*;
public class treeset2{
	public static void main(String[] args)
	{
		TreeSet<String> t=new TreeSet<String>();
		t.add("india");
		t.add("usa");
		t.add("ethio");
		t.add("england");
		t.add("sweden");
		t.add("Russia");
		System.out.println("content of tree set:"+t);
		System.out.println("floor(norway)"+t.floor("norway"));
		System.out.println("ceiling(norway):"+t.ceiling("norway"));
		System.out.println("lower():"+t.lower("india"));
		System.out.println("higher():"+t.higher("india"));
		System.out.println("after using descendingIterator");
		Iterator<String> i=t.descendingIterator();
		while(i.hasNext())
			System.out.println(i.next()+"\t");
		System.out.println();
		t.pollFirst();
		System.out.println(t);
		t.pollLast();
		System.out.println("after using pollLast");
		System.out.println(t);
	}
}
		