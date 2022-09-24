package pack;
import java.util.*;
public class gettime{
	public static void main(String[] args)
	{
		Calendar c=Calendar.getInstance();
		System.out.println("getTimeInMillis:"+c.getTimeInMillis());
		System.out.println("getTime:"+c.getTime());
		c.setTimeInMillis(12345678);
		System.out.println("after that getTimeInMillis:"+c.getTimeInMillis());
		System.out.println("now the time is:"+c.getTime());
		c.setTime(new Date());
		System.out.println("getTimeInMillis:"+c.getTimeInMillis());
		System.out.println("after all of that the time is:"+c.getTime());
	}
}