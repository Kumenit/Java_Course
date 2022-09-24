package pack;
import java.util.*;
public class arrylist4{
	public static void main(String[] args)
	{
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("kome");
		a1.add("sofe");
		a1.add("desta");
		a1.add("genet");
		a1.add("beza");
		System.out.println("array list of a1:");
		System.out.println(a1);
		Object o[]=a1.toArray();
		for(int i=0;i<o.length;i++)
			System.out.println(o[i]+"\t");
		System.out.println();
		String s[]=new Sting[5];
		System.out.println("the contant of string :");
		a1.toArray(s);
		for(i;i<s.length;i++)
			System.out.println(s[i]+"\t");
		
	}
}
		