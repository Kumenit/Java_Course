package pack;
import java.util.*;
public class vector{
	public static void disp(Vector v)
	{
		Enumeration<String> e=v.elements();
		while(e.hasMoreElements())
		System.out.println(e.nextElement()+"\t");
	}
	public static void main(String[] args)
	{
		Vector<String> v=new Vector<String>();
		v.addElement("kumenit");
		v.addElement("sofonias");
		v.addElement("desta");
		System.out.println("intial contetent of v:");
		disp(v);
		Object o[]=new Object[10];
		v.copyInto(o);
		System.out.println("\n contetent of arry is:");
		for(int i=1;i<v.size();i++)
			System.out.println(o[i]+"\t");
		v.insertElementAt("finland",2);
		System.out.println("after inserting finland");
		disp(v);
		v.setElementAt("norway",1);
		System.out.println("after compent ");
		disp(v);
		v.removeElementAt(4);
		System.out.println("after removing the 4 element");
		disp(v);
		v.setSize(15);
		System.out.println("the size is"+v.size());
		v.trimToSize();
		System.out.println("after trimming to size"+v.capacity());
	}
}