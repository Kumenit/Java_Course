package pack;
import java.util.*;
public class unmodfied{
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
		disp(al);
		List<String> l=Collections.unmodifiableList(al);
		try{
			l.add("kome");
			l.add("sofe");
		}catch(UnsupportedOperationException e)
		{
			System.out.println("an exception occured");
			System.out.println(e.getMessage());
		}
		disp(al);
	}
}