package pack;
import java.util.*;
public class linkedlist2{
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
		System.out.println("intial contant");
		System.out.println(l1);
		l1.removeFirst();
		l1.remove();
		l1.pop();
		l1.remove("usa");
		System.out.println("after using remove and pop");
		System.out.println(l1);
		l1.addLast("Russia");
		System.out.println("after adding Russia");
		System.out.println(l1);
		l1.removeFirstOccurrence("Russia");
		System.out.println("after removeFirstOccurrence russia");
		System.out.println(l1);
		l1.removeLast();
		l1.pollLast();
		System.out.println("after using removeLast and pollLast");
		System.out.println(l1);
		l1.addFirst("Russia");
		l1.addLast("Russia");
		System.out.println("after adding russia agian");
		System.out.println(l1);
		l1.removeLastOccurrence("Russia");
        System.out.println("after using removeLastOccurrence");
		System.out.println(l1);
	}
}