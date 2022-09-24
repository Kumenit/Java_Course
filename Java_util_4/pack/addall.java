package pack;
import java.util.*;
public class addall{
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		LinkedList<Integer> l=new LinkedList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		
		l.add(4);
		l.add(3);
		System.out.println("using disJoint"+Collections.disjoint(al,l));
		Collections.addAll(al,9,8,7,6);
		System.out.println("after using aaddall al is:"+al);
		int a[]={12,13,14};
		
	}
}