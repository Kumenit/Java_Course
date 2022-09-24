package pack;
import java.util.*;
public class arrylist{
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
		
		ArrayList<String> a2=new ArrayList<String>();
		a2.add("cmc");
		a2.add("mixco");
		a2.add("garment");
		a2.add("bola");
		System.out.println("array list of a2:");
		System.out.println(a2);
		a1.add(3,"game");
		System.out.println("after adding game a1 is:");
		System.out.println(a1);
		a1.addAll(a2);
		System.out.println("after adding all a2 a1 is:");
		System.out.println(a1);
		a1.addAll(1,a2);
		System.out.println("after adding a2 in 1:");
		System.out.println(a1);
		System.out.println("index of cmc is:"+a1.indexOf("cmc"));
		System.out.println("last index of cmc:"+a1.lastIndexOf("cmc"));
		a1.remove(2);
		System.out.println("after removeing desta:");
		System.out.println(a1);
		a1.remove("kome");
		System.out.println("after removing kome:");
		System.out.println(a1);
		a1.removeAll(a2);
		System.out.println("after removeing all a2:");
		System.out.println(a1);
		a1.clear();
		System.out.println("after removeing all of a1:");
		System.out.println(a1);
	}
}
		