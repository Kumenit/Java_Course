package pack;
import java.util.*;
public class resourcebundle2{
	public static void main(String[] args)
	{
		Locale l[]={Locale.ENGLISH,Locale.FRENCH,Locale.ITALIAN};
		for(int i=0;i<l.length;i++)
		{
		ResourceBundle rb=ResourceBundle.getBundle("pack.get",l[i]);
		System.out.println("the locale is:"+rb.getLocale());
		Enumeration<String> e=rb.getKeys();
		while(e.hasMoreElements())
		{
			String s=e.nextElement();
			String t=rb.getString(s);
			System.out.println("keys"+s+"values"+t);
		}
		}
	}
}