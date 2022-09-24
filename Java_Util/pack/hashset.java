package pack;
import java.util.*;
public class hashset{
	public static void main(String[] args)
	{
		HashSet<String> l1=new HashSet<String>();
		l1.add("india");
		l1.add("usa");
		l1.add("ethio");
		l1.add("england");
		l1.add("sweden");
		l1.add("Russia");
		System.out.println("hashset content:"+l1);
		System.out.println("elments of hashset");
		Iterator<String> i=l1.iterator();
		while(i.hasNext()){
			System.out.println(i.next()+"\t");
		}
		System.out.println();
		boolean b=l1.add("india");
		System.out.println("the add element succeeded:"+b);
		System.out.println("after adding india:"+l1);
	}
}
		
		