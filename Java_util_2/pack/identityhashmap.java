package pack;
import java.util.*;
public class identityhashmap{
	public static void main(String[] args)
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		String s1=new String("ku");
		String s2=new String("ku");
		hm.put(s1,"kumenit");
		hm.put(s2,"kumenit");
		System.out.println("keyset:"+hm.keySet());
		System.out.println("values:"+hm.values());
		IdentityHashMap<String,String> im=new IdentityHashMap<String,String>();
		im.put(s1,"kumenit");
		im.put(s2,"kumenit");
		System.out.println("keySet:"+im.keySet());
		System.out.println("values:"+im.values());
	}
}