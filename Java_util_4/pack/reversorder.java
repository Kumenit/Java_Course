package pack;
import java.util.*;
public class reversorder{
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
		Collections.sort(al,d);
		disp(al);
		Comparator<doc> c=Collections.reverseOrder(d);
		Collections.sort(al,c);
		System.out.println("after using reversOrdaer:");
		disp(al);
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("kome");
		al2.add("sofe");
		al2.add("me");
		Comparator<String> c1=Collections.reverseOrder();
		Collections.sort(al2,c1);
		System.out.println("now:"+al2);
	}
}
		
	
		