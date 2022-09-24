package pack;
public class comparing{
	public static void main(String[] args)
	{
		String s1="like";
		String s2="best";
		String s3="LIKE";
		System.out.println("compareTo:"+s1.compareTo(s2));
		System.out.println("compareTo:"+s1.compareTo(s3));
		System.out.println("compareToIgnoreCase:"+s1.compareToIgnoreCase(s3));
		CharSequence cs="ke";
		System.out.println("contains:"+s1.contains(cs));
		System.out.println("contentEquals:"+s1.contentEquals(cs));
        StringBuffer sb=new StringBuffer("sa");
		System.out.println("contentEquals:"+s1.contentEquals(sb));
		System.out.println("startsWith:"+s1.startsWith("l"));
		System.out.println("startsWith:"+s1.startsWith(" "));
        System.out.println("startsWith:"+s1.startsWith("ik",2));
        System.out.println("endsWith::"+s1.endsWith("ke"));
		System.out.println("equals:"+s1.equals(s3));
		System.out.println("equalsIgnorecase:"+s1.equalsIgnoreCase(s3));
		System.out.println("isEmpty:"+s1.isEmpty());
		System.out.println("matches:"+s1.matches(s3));
		String s4="panama";
		String s5="manama";
		System.out.println("regionMatches:"+s4.regionMatches(1,s5,1,5));
		System.out.println("regionMatches:"+s4.regionMatches(0,s5,0,3));
		String s6="MANAMA";
		System.out.println("regionMatches t&f:"+s4.regionMatches(true,2,s6,2,4));
		System.out.println("regionMatches t&f:"+s4.regionMatches(false,2,s6,2,4));
	}
}
		