package pack;
import java.util.*;
public class timezone{
	public static void main(String[] args)
	{
		Calendar c=Calendar.getInstance();
		System.out.println("get the time zone:"+c.getTimeZone());
		c.setLenient(true);
		System.out.println("isLenient:"+c.isLenient());
		c.set(2015,4,33);
		System.out.println("get year:"+c.get(Calendar.YEAR));
		System.out.println("get month:"+c.get(Calendar.MONTH));
		System.out.println("get date:"+c.get(Calendar.DATE));
		c.setLenient(false);
		System.out.println("isLenient:"+c.isLenient());
		c.set(2010,4,33);
		try{
		System.out.println("get year:"+c.get(Calendar.YEAR));
		System.out.println("get month:"+c.get(Calendar.MONTH));
		System.out.println("get date:"+c.get(Calendar.DATE));
		}catch(IllegalArgumentException e)
		{
			System.out.println("IllegalArgumentException has occured");
			System.out.println(e.getMessage());
		}
		System.out.println("now cureent time zone:"+c.getTimeZone());
		c.setTimeZone(TimeZone.getTimeZone("Pacific/Auckland"));
		System.out.println("after adding anoter timeZone:"+c.getTimeZone());
	}
}