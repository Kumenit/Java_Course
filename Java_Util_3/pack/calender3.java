package pack;
import java.util.*;
public class calender3{
	public static void main(String[] args)
	{
		Calendar c=Calendar.getInstance();
		Calendar c1=Calendar.getInstance();
		System.out.println("compareTo:"+c.compareTo(c1));
		c1.set(2010,4,6);
		System.out.println("after set used compareTo:"+c.compareTo(c1));
		System.out.println("after set used:"+c1.compareTo(c));
		System.out.println("using before:"+c.before(c1));
		System.out.println("using after:"+c.after(c1));
	}
}