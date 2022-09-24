package pack;
import java.util.*;
public class simpletimezone{
	public static void main(String[] args)
	{
		SimpleTimeZone st=new SimpleTimeZone(0,"ABC");
		System.out.println("timezone:"+st);
		st.setStartYear(2010);
		st.setStartRule(Calendar.JUNE,1,11*60*60*1000);
		st.setEndRule(Calendar.DECEMBER,31,11*60*60*1000);
		System.out.println();
		System.out.println("afte all:"+st);
	}
}