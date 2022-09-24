package qpack;
public class x3{
	public static void main(String[] args)
	{
		String s1="She sells sea shells on the seashore";
		System.out.println(s1.indexOf("sea",1));
		System.out.println(s1.indexOf("sea",13));
		System.out.println(s1.lastIndexOf('a'));
		System.out.println(s1.lastIndexOf('A'));
		System.out.println(s1.lastIndexOf("sea"));
		System.out.println(s1.lastIndexOf('a',8));
		System.out.println(s1.lastIndexOf("sea",27));
		System.out.println(s1.length());
		System.out.println(s1.matches("Alexandria"));
		System.out.println(s1.matches("xyz"));
	}
}