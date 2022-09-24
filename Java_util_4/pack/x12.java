package pack;
import java.util.*;
public class x12{
	public static void main(String[] args)
	{
		ArrayList<Integer> al=new ArrayList<Integer>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(60);
		al.add(70);
		al.add(80);
		al.add(90);
		al.add(100);
		System.out.println(al);
		Collections.rotate(al,3);
		System.out.println(al);
		Collections.rotate(al,8);
		System.out.println(al);
	}
}