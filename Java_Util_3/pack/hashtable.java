package pack;
import java.util.*;
public class hashtable{
	public static void main(String[] args)
	{
		Hashtable<String,String> h=new Hashtable<String,String>();
		h.put("ku","kumenit");
		h.put("so","sofonias");
		h.put("d","desta");
		Enumeration<String> e=h.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement()+"\t");
		e=h.keys();
		while(e.hasMoreElements())
			System.out.println(e.nextElement()+"\t");
		System.out.println("get ku:"+h.get("ku"));
	}
}