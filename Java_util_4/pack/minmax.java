package pack;
import java.util.*;
public class minmax{
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println("the value of al:"+al);
		System.out.println("min:"+Collections.min(al));
		System.out.println("max:"+Collections.max(al));
		doc d1=new doc(5,"me","you");
		doc d2=new doc(4,"genet","cmc");
		doc d3=new doc(3,"desta","that");
		doc d4=new doc(2,"sofe","idiot");
		doc d5=new doc(1,"kome","love");
		doc d=new doc();
			ArrayList<doc> al2=new ArrayList<doc>();
		al2.add(d1);
		al2.add(d2);
		al2.add(d3);
		al2.add(d4);
		al2.add(d5);
		System.out.println("min al2:"+Collections.min(al2,d));
		System.out.println("max al2:"+Collections.max(al2,d));
	}
}
		