package pack;
import java.util.*;
public class treemap{
	public static void main(String[] args)
	{
		TreeMap<String,String> t=new TreeMap<String,String>();
		t.put("t","that");
		t.put("ku","kumenit");
		t.put("so","sofoniase");
		t.put("d","desta");
		t.put("gen","genet");
		t.put("l","like");
		t.put("ga","game");
		t.put("swe","sweden");
		System.out.println("value of t:"+t);
		System.out.println("ceilingEntry:"+t.ceilingEntry("d"));
		System.out.println("floorEntry:"+t.floorEntry("d"));
		System.out.println("lowerKey:"+t.lowerKey("ku"));
		System.out.println("higherKey:"+t.higherKey("ku"));
		System.out.println("ceilingKey:"+t.ceilingKey("so"));
		System.out.println("floorKey:"+t.floorKey("so"));
		System.out.println("first key:"+t.firstKey());
		System.out.println("lastKey:"+t.lastKey());
		System.out.println("descendingKeySet:"+t.descendingKeySet());
		System.out.println("descendingMap:"+t.descendingMap());
		System.out.println("first entry:"+t.firstEntry());
		System.out.println("last entry:"+t.lastEntry());
		System.out.println("hadeMap:"+t.headMap("ga"));
		System.out.println("hadeMap true:"+t.headMap("ga",true));
		System.out.println("tailMap:"+t.tailMap("ga"));
		System.out.println("tailMap true:"+t.tailMap("ga",true));
		System.out.println("higher entry:"+t.higherEntry("ku"));
		System.out.println("lower entry:"+t.lowerEntry("ku"));
		System.out.println("nevigableSet:"+t.navigableKeySet());
		t.pollFirstEntry();
		System.out.println("after removing first:"+t);
		t.pollLastEntry();
		System.out.println("after removing last:"+t);
		System.out.println("submap:"+t.subMap("so","l"));
		System.out.println("subMap true:"+t.subMap("ku",true,"ga",true));
		System.out.println("subMap false:"+t.subMap("ku",false,"ga",false));
	}
}
		
		
		