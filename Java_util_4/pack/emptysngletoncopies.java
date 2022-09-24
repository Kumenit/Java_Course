package pack;
import java.util.*;
public class emptysngletoncopies{
public static void disp(List<String> l)
	{
		Iterator<String> i=l.iterator();
		while(i.hasNext())
			System.out.println(i.next()+"\t");
		System.out.println();
	}
	public static void disps(Set<String> s)
	{
		Iterator<String> i=s.iterator();
		while(i.hasNext())
			System.out.println(i.next()+"\t");
		System.out.println();
	}
	public static void main(String[] args)
	{
		Set<String> s=Collections.emptySet();
		System.out.println("isEmpty:"+s.isEmpty());
		try{
			s.add("that");
		}catch(UnsupportedOperationException e)
		{
			System.out.println("can't add");
		}
		Set<String> s1=Collections.singleton("game");
		disps(s1);
		try{
			s1.add("kome");
		}catch(UnsupportedOperationException e)
		{
			System.out.println("can't add this set");
		}
		List<String> l=Collections.nCopies(4,"kome");
		disp(l);
		try{
			l.add("sofe");
		}catch(UnsupportedOperationException e)
		{
			System.out.println("can't add sofe because he is idiot");
		}
	}
}