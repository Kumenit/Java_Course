package pack;
import java.util.*;
public class indexofsublist{
	public static void disp(LinkedList<Integer> al)
	{
		Iterator<Integer> i=al.iterator();
		while(i.hasNext())
			System.out.println(i.next()+"\t");
		System.out.println();
	}
	public static void main(String[] args)
	{
	  LinkedList<Integer> ll=new LinkedList<Integer>();
	  ll.add(1);
	  ll.add(2);
	  ll.add(3);
	  ll.add(4);
	  ll.add(5);
	  ll.add(6);
	  ll.add(3);
	  ll.add(4);
	  disp(ll);
	  LinkedList<Integer> l2=new LinkedList<Integer>();
	  l2.add(3);
	  l2.add(4);
	  disp(l2);
	  System.out.println("indexOfSubList:"+Collections.indexOfSubList(ll,l2));
	  System.out.println("lastIndexOfSubList:"+Collections.lastIndexOfSubList(ll,l2));
	}
}