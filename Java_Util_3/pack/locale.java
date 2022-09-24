package pack;
import java.util.*;
public class locale{
	public static void main(String[] args)
	{
		System.out.println(Locale.getDefault());
		Locale.setDefault(new Locale("in","IN"));
		System.out.println("after changing the default:"+Locale.getDefault());
		Locale l[]=Locale.getAvailableLocales();
		System.out.println("the installed locale are:");
		for(int i=0;i<l.length;i++)
		{
			System.out.println(l[i]+"\t");
		}
		System.out.println();
		System.out.println("all languages:");
		String s[]=Locale.getISOLanguages();
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+"\t");
		}
		String s1[]=Locale.getISOCountries();
		for(int i=0;i<s1.length;i++)
		{
			System.out.println(s1[i]+"\t");
		}
	}
}
		
		