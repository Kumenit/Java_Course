package qpack;
public class x4{
	public static void main(String[] args)
	{
		String s1="She sells sea shells on the seahore";
		String s2="sea shells";
		String s3="SEA SHELLS";
		String s4,s5,s6,s7,a[],s9[],b[];
		CharSequence cs1="sea",cs2="bee";
		System.out.println(s1.offsetByCodePoints(3,6));
		System.out.println(s1.regionMatches(10,s2,0,10));
		System.out.println(s1.regionMatches(3,s2,3,3));
		System.out.println(s1.regionMatches(true,10,s3,0,10));
		System.out.println(s1.regionMatches(false,10,s3,0,10));
		System.out.println(s1.startsWith("She"));
		System.out.println(s1.startsWith("S"));
		System.out.println(s1.startsWith(" "));
		System.out.println(s1.startsWith("she"));
		System.out.println(s1.startsWith("se",4));
		System.out.println(s1.startsWith("fg",4));
		s4=s1.replace('a','b');
		System.out.println(s4);
		s4=s1.replace('p','q');
		System.out.println(s4);
		s5=s1.replace(cs1,cs2);
		System.out.println(s5);
		s6=s1.replace(cs2,cs1);
		System.out.println(s6);
		s7=s1.replaceAll("sea","b");
		System.out.println(s7);
		s7=s1.replaceFirst("b","sea");
		System.out.println(s7);
		a="jammu and kashmir".split("and");
		for(int i=0;i<a.length;i++)
			System.out.println(i);
		s9="jammu and kashmir".split("a");
		for(int i=0;i<s9.length;i++)
		System.out.println(s9[i]);
	b="jammu and kashmir".split("a",3);
	for(int i=0;i<b.length;i++)
		System.out.println(i);
	}
}
	
		
		