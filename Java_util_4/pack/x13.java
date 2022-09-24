package pack;
import java.util.*;
public class x13{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("me");
		Collection<String> c=Collections.unmodifiableList(al);
		try{
			c.add("game");
		}catch(Exception e)
		{
			System.out.println("can not add ");
		}
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("you","me");
		Map<String,String> m=Collections.unmodifiableMap(hm);
		try{
			m.put("like","that");
		}catch(Exception e)
		{
			System.out.println("can not put");
		}
		HashSet<String> hs=new HashSet<String>();
		hs.add("kome");
		Set<String> s=Collections.emptySet();
		System.out.println("is hs emptySet:"+s.isEmpty());
		Set<String> s1=Collections.singleton("sofe");
		System.out.println("s:"+s1);
		List<String> l=Collections.nCopies(7,"kome");
		System.out.println(l);
	}
}
		