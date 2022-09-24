package pack;
import java.util.*;
public class linkedlist3{
	public static void main(String[] args)
	{
	ArrayList<String> l1=new ArrayList<String>();
		l1.add("india");
		l1.add("usa");
		l1.add("ethio");
		l1.add("england");
		l1.add("sweden");
		l1.add("Russia");
		l1.add("japan");
		l1.add("finland");
		l1.add("china");
		LinkedList<String> l2=new LinkedList<String>(l1);
		System.out.println("intial contant");
		System.out.println("l2");
		String s=l2.getFirst();
		System.out.println("getFirst:"+s);
		s=l2.element();
		System.out.println("element:"+s);
		s=l2.peek();
		System.out.println("peek:"+s);
		s=l2.peekFirst();
		System.out.println("peekFirst:"+s);
		s=l2.getLast();
		System.out.println("getLast:"+s);
		s=l2.peekLast();
		System.out.println("peekLast:"+s);
		System.out.println("after using the 6 methods");
		System.out.println(l2);
	}
}