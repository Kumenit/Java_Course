package pack;
import java.util.*;
public class timezone1{
	public static void main(String[] args)
	{
		TimeZone tz=TimeZone.getDefault();
		System.out.println("getId:"+tz.getID());
		System.out.println("toString:"+tz.toString());
		System.out.println("getDisplayName:"+tz.getDisplayName());
		Locale l=new Locale("fr","FR");
		System.out.println("getDisplayName local:"+tz.getDisplayName(l));
		System.out.println("getDisplayName with true:"+tz.getDisplayName(true,TimeZone.LONG));
		System.out.println("getDisplayName with true and local:"+tz.getDisplayName(true,TimeZone.LONG,l));
	}
}