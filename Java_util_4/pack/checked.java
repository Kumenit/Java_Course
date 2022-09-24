package pack;
import java.util.*;
public class checked{
	public static void disp(ArrayList<String> al)
	{
		Iterator<String> i=al.iterator();
		while(i.hasNext())
			System.out.println(i.next()+"\t");
		System.out.println();
	}
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("me");
		al.add("you");
		System.out.println("the value of al:");
		disp(al);
		Collection<String> c=Collections.checkedList(al,String.class);
		c.add(2);
		System.out.println("c is:"+c);
		
		
		
	}
}
		