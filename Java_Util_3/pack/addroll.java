package pack;
import java.util.*;
public class addroll{
	public static void main(String[] args)
	{
		Calendar c=Calendar.getInstance();
		System.out.println("get year:"+c.get(Calendar.YEAR));
		c.add(Calendar.YEAR,12);
		System.out.println("afyter that get year:"+c.get(Calendar.YEAR));
		System.out.println("get date:"+c.get(Calendar.DATE));
		c.roll(Calendar.DATE,true);
		System.out.println("now the date is:"+c.get(Calendar.DATE));
		c.roll(Calendar.DATE,5);
		System.out.println("after that date:"+c.get(Calendar.DATE));
	}
}