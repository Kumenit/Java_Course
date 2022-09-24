package qpack;
public class x1{
	public static void main(String[] args)
	{
		String s="Alexandria";
		CharSequence cs,cs1="dria",cs2="Alexandria";
		boolean b;
		StringBuffer sb1,sb2;
		System.out.println(s.charAt(4));
		System.out.println(s.codePointAt(5));
		System.out.println(s.codePointBefore(5));
		System.out.println(s.codePointCount(1,6));
		System.out.println(s.compareTo("alexandria"));
		System.out.println(s.compareTo("India"));
		System.out.println(s.compareTo("Alexandria"));
		System.out.println(s.compareToIgnoreCase("alexandria"));
		System.out.println(s.compareToIgnoreCase("alexandria".concat("is in Egypt")));
	    cs=s;
		b="Alexandria is in Egypt".contains(cs);
		System.out.println(b);
		b="Cairo is in Egypt".contains(cs);
		System.out.println(b);
		b=s.contentEquals(cs1);
		System.out.println(b);
		b="Alexandria".contentEquals(cs2);
		System.out.println(b);
		sb1=new StringBuffer("dria");
		b="Alexandria".contentEquals(sb1);
		System.out.println(b);
		sb2=new StringBuffer("Alexandria");
		b=s.contentEquals(sb2);
		System.out.println(b);
	}
}