package pack;
import java.util.*;
public class x10{
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(2);
		al.add(6);
		al.add(4);
		al.add(1);
		al.add(0);
		System.out.println("the value of al:"+al);
		Collections.sort(al);
		System.out.println("after sort:"+al);
		System.out.println("indexOf:"+Collections.binarySearch(al,5));
	}
}