package pack;
import java.util.*;
public class calender{
	public static void main(String[] args)
	{
		Calendar c=Calendar.getInstance();
		System.out.println("the curren time:");
		System.out.println("the date:"+c.get(Calendar.DATE));
		System.out.println("the monthe:"+c.get(Calendar.MONTH));
		System.out.println("the year:"+c.get(Calendar.YEAR));
		System.out.println("the hour:"+c.get(Calendar.HOUR));
		System.out.println("the minute:"+c.get(Calendar.MINUTE));
		System.out.println("the second:"+c.get(Calendar.SECOND));
		c.set(2022,8,16,7,8,12);
		System.out.println("after seting another time:");
		System.out.println("the date:"+c.get(Calendar.DATE));	
		System.out.println("the monthe:"+c.get(Calendar.MONTH));
		System.out.println("the year:"+c.get(Calendar.YEAR));
		System.out.println("the hour:"+c.get(Calendar.HOUR));
		System.out.println("the minute:"+c.get(Calendar.MINUTE));
		System.out.println("the second:"+c.get(Calendar.SECOND));
		c.clear(Calendar.MONTH);
		System.out.println("after clearing monthe:");
		System.out.println("now using isSet:"+c.isSet(Calendar.MONTH));
		System.out.println("using get:"+c.get(Calendar.MONTH));
		c.clear();
		System.out.println("after clearing all:");
		System.out.println("the date:"+c.get(Calendar.DATE));
		System.out.println("the monthe:"+c.get(Calendar.MONTH));
		System.out.println("the year:"+c.get(Calendar.YEAR));
		System.out.println("the hour:"+c.get(Calendar.HOUR));
		System.out.println("the minute:"+c.get(Calendar.MINUTE));
		System.out.println("the second:"+c.get(Calendar.SECOND));
	}
}