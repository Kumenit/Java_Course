package pack;
import java.util.*;
public class usesetfrommap{
	public static void main(String[] args)
	{
		WeakHashMap<String,Boolean> m=new WeakHashMap<String,Boolean>();
		Set<String> s=Collections.newSetFromMap(m);
		s.add("me");
		s.add("you");
		System.out.println("the set is:"+s);
		System.out.println("the map is:"+m);
	}
}