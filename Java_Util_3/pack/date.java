package pack;
import java.util.*;
public class date{
	public static void main(String[] args)
	{
		Date d=new Date();
		System.out.println(d.toString());
		Date d1=new Date(123401);
		System.out.println("get time:"+d.getTime());
		System.out.println("is d less than d1:"+d.before(d1));
		System.out.println("is d greater than d1:"+d.after(d1));
		Long l=d1.getTime();
		d.setTime(l);
		d1.setTime(l);
		System.out.println("is d equals d1:"+d.equals(d1));
		System.out.println("compareTo:"+d.compareTo(d1));
	}
}