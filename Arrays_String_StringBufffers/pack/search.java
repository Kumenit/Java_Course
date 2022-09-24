package pack;
public class search{
	public static void main(String[] args)
	{
		String s1="India";
		System.out.println("string:"+s1);
		System.out.println("indexOf:"+s1.indexOf('i')+" "+s1.indexOf(97));
		String s2="malayalam";
		System.out.println("\n string:"+s2);
		System.out.println("indexOf(a,4):"+s2.indexOf('a',4));
		System.out.println("indexOf(al,1)&(al,2):"+s2.indexOf('a',1)+" "+s2.indexOf("al",2));
		System.out.println("lastIndexOf(2)&(al):"+s2.lastIndexOf(2)+" "+s2.lastIndexOf("al"));
		System.out.println("lastIndexOf(2,5)&(al,5):"+s2.lastIndexOf(2,5)+" "+s2.lastIndexOf("al",5));
		System.out.println("offdetByCodePoints:"+s2.offsetByCodePoints(2,5));
	}
}
		