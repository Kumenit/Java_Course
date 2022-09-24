package pack;
import java.util.*;
public class hashmap{
	public static void main(String[] args)
	{
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("ku","kumenit");
		hm.put("so","sofoniase");
		hm.put("d","desta");
		hm.put("gen","genet");
		System.out.println("keyset:"+hm.keySet());
		System.out.println("values:"+hm.values());
		System.out.println("containsKey:"+hm.containsKey("d"));
		System.out.println("containsValues:"+hm.containsValue("you"));
		Set<Map.Entry<String,String>> s=hm.entrySet();
		System.out.println("entrySet:"+s);
		System.out.println("get:"+hm.get("ku"));
		System.out.println("isEmpty:"+hm.isEmpty());
		HashMap<String,String> hm1=new HashMap<String,String>();
		hm1.put("l","like");
		hm1.put("ga","game");
		hm1.put("swe","sweden");
		System.out.println("hm1 value:"+hm1);
		hm.putAll(hm1);
		System.out.println("final value of hm:"+hm);
		System.out.println("remove so:"+hm.remove("so"));
		System.out.println("after  removing so hm is:"+hm);
		System.out.println("the size is:"+hm.size());
		System.out.println("to string:"+hm.toString());
		hm.clear();
		System.out.println("after clearing:"+hm);
	}
}