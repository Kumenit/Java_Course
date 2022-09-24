package pack;
import java.util.*;
public class weakhashmap{
	public static void main(String[] args)
	{
		WeakHashMap<Integer,Integer> wh=new WeakHashMap<Integer,Integer>();
		for(int i=1;i<=10;i++)
			wh.put(i,i*i);
		System.out.println("entrySet:"+wh.entrySet());
		System.gc();
		System.out.println("now keySet is:"+wh.keySet());
		System.out.println("now values are:"+wh.values());
		HashMap<Integer,Integer> m=new HashMap<Integer,Integer>();
		for(int i=1;i<=10;i++)
			m.put(i,i*i);
		System.out.println("entrySet:"+m.entrySet());
		System.gc();
		System.out.println("now keySet is:"+m.keySet());
		System.out.println("now values are:"+m.values());
	}
}