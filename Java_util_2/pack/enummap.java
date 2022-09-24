package pack;
import java.util.*;
public class enummap{
	public static void main(String[] args)
	{
		EnumMap<family,String> em=new EnumMap<family,String>(family.class);
		em.put(family.kumenit,"he is the one how wants to lern all about pc");
		em.put(family.sofonias,"he is the lezyst person in this world");
		em.put(family.desta,"he our father");
		em.put(family.genet,"she is our mother");
		System.out.println("key set");
		Set<family> s=em.keySet();
		Iterator<family> i=s.iterator();
		while(i.hasNext())
			System.out.println(i.next()+"\t");
		System.out.println("values");
		Collection<String> s1=em.values();
		Iterator<String> i2=s1.iterator();
		while(i2.hasNext())
			System.out.println(i2.next()+"\t");
		System.out.println("the value:"+em);
	}
}