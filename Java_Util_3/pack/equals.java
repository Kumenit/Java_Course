package pack;
import java.util.*;
public class equals{
	public static void main(String[] args)
	{
		Calendar c=Calendar.getInstance();
		System.out.println("is lenient:"+c.isLenient());
		System.out.println("getFirstDayOFWeek:"+c.getFirstDayOfWeek());
		System.out.println("getMinimalDaysInFirstWeek:"+c.getMinimalDaysInFirstWeek());
		System.out.println("getTimeZone:"+c.getTimeZone());
		Calendar c2=Calendar.getInstance(TimeZone.getTimeZone("Pacific/Auckland"));
		System.out.println("after changeing");
		System.out.println("is lenient:"+c2.isLenient());
		System.out.println("getFirstDayOFWeek:"+c2.getFirstDayOfWeek());
		System.out.println("getMinimalDaysInFirstWeek:"+c2.getMinimalDaysInFirstWeek());
		System.out.println("getTimeZone:"+c2.getTimeZone());
		System.out.println("is equal:"+c.equals(c2));
	}
}