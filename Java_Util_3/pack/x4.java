package pack;
import java.util.*;
public class x4{
	public static void main(String[] args)
	{
		Vector<String> v=new Vector<String>();
		v.addElement("kome");
		v.addElement("sofe");
		v.addElement("me");
		v.addElement("you");
		System.out.println("the value ofv:"+v);
		v.removeElementAt(2);
		System.out.println("after removeing elemtnt at 2:"+v);
		System.out.println("indexOf:"+v.indexOf("kome"));
		System.out.println("get firstElement:"+v.firstElement());
		System.out.println("get lastElment:"+v.lastElement());
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements())
			System.out.println(e.nextElement()+"\t");
		String s[]=new String[4];
		v.copyInto(s);
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]+"\t");
	}
}