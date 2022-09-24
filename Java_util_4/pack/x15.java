package pack;
import java.util.*;
public class x15{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("kome");
		Collections.addAll(al,"game","desta");
		String s[]={"that","is","me"};
		Collections.addAll(al,s);
		System.out.println("al is:"+al);
	}
}