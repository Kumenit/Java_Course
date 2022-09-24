package pack;
import java.util.*;
public class x3{
	public static void main(String[] args)
	{
		Properties p=new Properties();
		p.setProperty("kome","me");
		p.setProperty("sofe","you");
		Properties p2=new Properties(p);
		p2.setProperty("family","us");
		Properties p3=new Properties(p2);
		System.out.println("getProperty:"+p.getProperty("kome"));
		System.out.println("getProperty of p2 for p1:"+p.getProperty("family","nothing here"));
		System.out.println("stringPropertyName:"+p3.stringPropertyNames());
	}
}