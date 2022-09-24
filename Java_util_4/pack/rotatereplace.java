package pack;
import java.util.*;
public class rotatereplace{
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
		al.add("a");
		al.add("b");
		al.add("c");
		al.add("d");
		al.add("e");
		System.out.println("the value of al");
		disp(al);
		Collections.rotate(al,4);
		System.out.println("after using rotate:");
		disp(al);
		Collections.replaceAll(al,"b","k");
		System.out.println("after replacing b with k:");
		disp(al);
	}
}