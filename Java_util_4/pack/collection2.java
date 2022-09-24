package pack;
import java.util.*;
public class collection2{
	public static void disp(ArrayList<Integer> al)
	{
		Iterator<Integer> i=al.iterator();
		while(i.hasNext())
			System.out.println(i.next()+"\t");
	}
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		System.out.println("the number in normal ordaring:"+al);
		Collections.reverse(al);
		System.out.println("after reversing:"+al);
		System.out.println("now the value of al is:");
		disp(al);
		Collections.swap(al,0,3);
		System.out.println("after swap used");
		disp(al);
		Collections.fill(al,3);
		System.out.println("after fill method have been used");
		disp(al);
	}
}
		