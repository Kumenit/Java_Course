package pack;
import java.util.*;
public class treeset{
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
		ArrayList<String> a=new ArrayList<String>();
		a.add("nepal");
		a.add("thailand");
		a.add("japan");
		a.add("germany");
		a.add("bhutan");
		boolean b=t.addAll(a);
		System.out.println("add all method:"+b);
		System.out.println("tree set content:"+t);
		System.out.println("first element of tree set:"+t.first());
		System.out.println("comparator:"+t.comparator());
	}
}
		