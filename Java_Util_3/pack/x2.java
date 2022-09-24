package pack;
import java.util.*;
public class x2{
	public static void main(String[] args)
	{
		Hashtable<String,String> h=new Hashtable<String,String>();
		h.put("kome","me");
		h.put("sofe","you");
		h.put("family","us");
		Enumeration<String> e=h.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement()+"\t");
		e=h.keys();
		while(e.hasMoreElements())
			System.out.println(e.nextElement()+"\t");
		System.out.println("the keys are:"+h.keySet());
		System.out.println("entrySet:"+h.entrySet());
		System.out.println("values:"+h.values());
	}
}