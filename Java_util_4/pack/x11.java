package pack;
import java.util.*;
public class x11{
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		Collections.reverse(al);
		System.out.println("after using reverse:"+al);
		Collections.swap(al,0,4);
		System.out.println("after using swap:"+al);
		Collections.fill(al,4);
		System.out.println("fill using 4:"+al);
		al.add(2);
		al.add(3);
		al.add(5);
		Collections.shuffle(al);
		System.out.println("after using suffle:"+al);
		Random r=new Random(300001);
		Collections.shuffle(al,r);
		System.out.println("after using suffle with r:"+al);
		ArrayList<Integer> al2=new ArrayList<Integer>();
		al2.add(8);
		al2.add(9);
		al2.add(10);
		al2.add(12);
		al2.add(14);
		al2.add(1);
		Collections.copy(al,al2);
		System.out.println("al:"+al);
		System.out.println("min:"+Collections.min(al));
		System.out.println("max:"+Collections.max(al));
		Collections.replaceAll(al,4,5);
		System.out.println("replaceAll 4 with 5:"+al);
		System.out.println("indexOfSubList:"+Collections.indexOfSubList(al,al2));
		System.out.println("lastIndexOfSubList:"+Collections.lastIndexOfSubList(al,al2));
	}
}