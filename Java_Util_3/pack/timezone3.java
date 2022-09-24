package pack;
import java.util.*;
public class timezone3{
	public static void main(String[] args)
	{
		TimeZone tz=TimeZone.getDefault();
		TimeZone tz1=TimeZone.getTimeZone("Pacific/Midway");
		System.out.println("hasSameRules:"+tz.hasSameRules(tz1));
		System.out.println("getID:"+tz.getID());
		tz.setID("India/Arabian Sea");
		System.out.println("now the id is:"+tz.getID());
		TimeZone.setDefault(TimeZone.getTimeZone("Pacific/Midway"));
		System.out.println("the default timezone is:"+TimeZone.getDefault());
		System.out.println("getRaeOffset:"+tz.getRawOffset());
		tz.setRawOffset(29800000);
		System.out.println("after set getRawOffset:"+tz.getRawOffset());
	}
}