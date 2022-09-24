package pack;
import java.util.*;
public class locale3{
	public static void main(String[] args)
	{
		Locale.setDefault(new Locale("et","ET"));
		Locale l=Locale.getDefault();
		System.out.println("get language:"+l.getLanguage());
		System.out.println("get country:"+l.getCountry());
		System.out.println("get variant:"+l.getVariant());
		System.out.println("to String:"+l.toString());
		System.out.println("getISOLanguage:"+l.getISO3Language());
		System.out.println("getISOCountries:"+l.getISO3Country());
		System.out.println("getDefaultLanguage:"+l.getDisplayLanguage());
		System.out.println("getDefaultCountries:"+l.getDisplayCountry());
		System.out.println("getDefaultVariant:"+l.getDisplayVariant());
		System.out.println("getDefaultName:"+l.getDisplayName());
		System.out.println("getDefaultLanguage in france:"+l.getDisplayLanguage(new Locale("fr","FR")));
		System.out.println("getDefaultCountries in france:"+l.getDisplayCountry(new Locale("fr","FR")));
		System.out.println("getDefaultVariant in france:"+l.getDisplayVariant(new Locale("fr","FR")));
		System.out.println("getDefaultName in france:"+l.getDisplayName(new Locale("fr","FR")));
		Locale l1=new Locale("fr","FR");
		System.out.println("equal:"+l.equals(l1));
	}
}