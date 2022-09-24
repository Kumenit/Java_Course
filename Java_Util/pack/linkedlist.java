package pack;
import java.util.*;
public class linkedlist{
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("india");
		a1.add("usa");
		a1.add("ethio");
		a1.add("finland");
		LinkedList<String> l1=new LinkedList<String>(a1);
		System.out.println("intial contant:");
		System.out.println(l1);
		l1.add("china");
		l1.addFirst("Russia");
		l1.addLast("iceland");
		System.out.println("after using add addFirst and addLast");
		System.out.println(l1);
		l1.offerFirst("uk");
		l1.offerLast("france");
		l1.offer("sweden");
		System.out.println("after using offer offerFirst and offerLast");
		System.out.println(l1);
		l1.push("germany");
		l1.push("japan");
		System.out.println("after using push");
		System.out.println(l1);
	}
}