package pack;
import java.util.*;
public class currancy{
	public static void main(String[] args)
	{
		Locale l=Locale.getDefault();
		Currency c=Currency.getInstance(l);
		System.out.println("the currancy code:"+c.getCurrencyCode());
		System.out.println("getSymbole:"+c.getSymbol());
		System.out.println("getDefaultFractionDigit:"+c.getDefaultFractionDigits());
		String s=c.toString();
		System.out.println("using to string:"+s);
		c=Currency.getInstance(new Locale("jpn","JP"));
		System.out.println("now the c value:"+c);
		System.out.println("now the currancy code is:"+c.getDefaultFractionDigits());
	}
}
		