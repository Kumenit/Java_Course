package pack;
import java.util.*;
public class arrylist2{
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("kome");
		a1.add("sofe");
		a1.add("desta");
		a1.add("genet");
		a1.add("beza");
		System.out.println("array list of a1:");
		System.out.println(a1);
		System.out.println("is a1 contains beza:"+a1.contains("beza"));
		System.out.println("is a1 contains me:"+a1.contains("me"));
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("sofe");
		a2.add("genet");
		System.out.println("is a1 contains a2:"+a1.containsAll(a2));
		LinkedList<String> l1=new LinkedList<String>(a1);
		System.out.println("is a1 equals l1:"+a1.equals(l1));
		System.out.println("object at index 3 is:"+a1.get(3));
		a1.set(3,"like");
		System.out.println("after using set method:");
		System.out.println(a1);
		a1.retainAll(a2);
		System.out.println("after using retainAll method:");
		System.out.println(a1);
		
	}
}
		