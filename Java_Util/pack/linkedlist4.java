package pack;
import java.util.*;
public class linkedlist4{
	public static void main(String[] args)
	{
		LinkedList<String> l1=new LinkedList<String>();
		l1.add("india");
		l1.add("usa");
		l1.add("ethio");
		l1.add("england");
		l1.add("sweden");
		l1.add("Russia");
		l1.add("japan");
		l1.add("finland");
		l1.add("china");
		System.out.println("contents of the list:"+l1);
		System.out.println("using descendingIterator");
		Iterator<String> i=l1.descendingIterator();
		while(i.hasNext())
			System.out.println(i.next()+"\t");
	}
}