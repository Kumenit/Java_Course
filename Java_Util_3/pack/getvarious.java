package pack;
import java.util.*;
public class getvarious{
	public static void main(String[] args)
	{
		Calendar c=Calendar.getInstance();
		System.out.println("the date:"+c.get(Calendar.DATE));
		System.out.println("getActualMinimum:"+c.getActualMinimum(Calendar.HOUR_OF_DAY));
		System.out.println("getActualMaximum:"+c.getActualMaximum(Calendar.HOUR_OF_DAY));
		System.out.println("getGreatestMinimum:"+c.getGreatestMinimum(Calendar.HOUR_OF_DAY));
		System.out.println("getGreatestMaximum:"+c.getLeastMaximum(Calendar.HOUR_OF_DAY));
		System.out.println("getMaximum:"+c.getMaximum(Calendar.HOUR_OF_DAY));
		System.out.println("getMinimum:"+c.getMinimum(Calendar.HOUR_OF_DAY));
		Locale l=new Locale("et","ET");
		System.out.println("get display name:"+c.getDisplayName(Calendar.DAY_OF_WEEK,Calendar.LONG,l));
		System.out.println("getFirstDayOfWeek:"+c.getFirstDayOfWeek());
		c.setFirstDayOfWeek(Calendar.MONDAY);
		System.out.println("getFirstDayOfWeek:"+c.getFirstDayOfWeek());
		System.out.println("getMinimalDayInFirstWeek:"+c.getMinimalDaysInFirstWeek());
		c.setMinimalDaysInFirstWeek(7);
		System.out.println("getMinimalDayInFirstWeek:"+c.getMinimalDaysInFirstWeek());
	}
}