package pack;
import java.util.*;
public class gregoriancalender{
	public static void main(String[] args)
	{
		GregorianCalendar gc=new GregorianCalendar();
		System.out.println("is 2000 leap:"+gc.isLeapYear(2000));
        System.out.println("is 1885 leap:"+gc.isLeapYear(1885));
		System.out.println("get the gregorianchange:"+gc.getGregorianChange());
		Date d=new Date();
		gc.setGregorianChange(d);
		System.out.println("after set getGregoeianCalendar:"+gc.getGregorianChange());
	}
}
		