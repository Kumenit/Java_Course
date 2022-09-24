package pack;
import java.util.*;
public class collection{
	public static void disp(ArrayList<doc> al)
	{
		Iterator<doc> i=al.iterator();
		while(i.hasNext())
			System.out.println(i.next()+"\t");
		System.out.println();
	}
	public static void main(String[] args)
	{
		doc d1=new doc(5,"me","you");
		doc d2=new doc(4,"genet","cmc");
		doc d3=new doc(3,"desta","that");
		doc d4=new doc(2,"sofe","idiot");
		doc d5=new doc(1,"kome","love");
		doc d=new doc();
		ArrayList<doc> al=new ArrayList<doc>();
		al.add(d1);
		al.add(d2);
		al.add(d3);
		al.add(d4);
		al.add(d5);
		System.out.println("the contenets of the list are");
		disp(al);
		Collections.sort(al,d);
		System.out.println("after sort");
		disp(al);
		doc k=new doc(3,"that","desta");
		int i=Collections.binarySearch(al,k,d);
		if(i<0)
		{
			System.out.println("key"+k+"is not present");
			System.out.println("index:"+i);
		}
		else{
			System.out.println("key"+k+"is present index:"+i);
		}
	}
}