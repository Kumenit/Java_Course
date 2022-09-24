package pack;
import java.util.*;
public class observer{
	public static void main(String[] args)
	{
		stock s=new stock();
		s.set(100);
		System.out.println("the orignal value:"+s.get());
		stocktread s1=new stocktread(s,"kome");
		stocktread s2=new stocktread(s,"sofe");
		stocktread s3=new stocktread(s,"desta");
		s.addObserver(s1);
		s.addObserver(s2);
		s.addObserver(s3);
		System.out.println("the number of observer are:"+s.countObservers());
		s.set(500);
		s.set(1000);
		System.out.println("state of s has changed:"+s.hasChanged());
		System.out.println("deleting observer kome");
		s.deleteObserver(s1);
		System.out.println("now observer number is:"+s.countObservers());
		s.set(2001);
		s.deleteObservers();
		System.out.println("after invoking deleteObservers the number are:"+s.countObservers());
	}
}