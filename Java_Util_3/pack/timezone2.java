package pack;
import java.util.*;
public class timezone2{
	public static void main(String[] args)
	{
		TimeZone tz=TimeZone.getDefault();
		System.out.println("getDSTSaving:"+tz.getDSTSavings());
		System.out.println("getOffSet:"+tz.getOffset(Calendar.ERA,2020,5,1,3,1000));
		Date d=new Date();
		long l=d.getTime();
		System.out.println("getOffSet with local:"+tz.getOffset(l));
		System.out.println("inDayLightTime:"+tz.inDaylightTime(d));
		System.out.println("useDayLightTime:"+tz.useDaylightTime());
		String s[]=TimeZone.getAvailableIDs(960000);
		for(int i=0;i<s.length;i++)
			System.out.print(s[i]+"\t");
	}
}