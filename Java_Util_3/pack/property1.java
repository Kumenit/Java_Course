package pack;
import java.util.*;
public class property1{
	public static void main(String[] args)
	{
		Properties p2=new Properties();
		p2.setProperty("b","beza");
		p2.setProperty("ge","genet");
		Properties p1=new Properties(p2);
		p1.setProperty("f","family");
		Properties p=new Properties(p1);
		p.setProperty("ku","kumenit");
		p.setProperty("so","sofonias");
		p.setProperty("d","desta");
		System.out.println("getProperty of ku:"+p.getProperty("ku"));
		System.out.println("getProperty me:"+p.getProperty("me"));
		System.out.println("getProperty me:"+p.getProperty("me","noting"));
		System.out.println("the keys are:");
		Enumeration<?> e=p.propertyNames();
		while(e.hasMoreElements())
		System.out.println(e.nextElement()+"\t");
		System.out.println();
		p.put(new Double(12),new Double(1));
		p.put(new Double(23),new Double(2));
		System.out.println("after add two double");
		System.out.println(p);
		Set<String> s=p.stringPropertyNames();
		System.out.println(s);
	}
}