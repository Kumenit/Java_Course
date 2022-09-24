package qpack;
public class x5{
	public static void main(String[] args)
	{
		String s1="She sells sea shells on the seashore";
		String s2,s3;
		char c[];
		CharSequence cs;
		cs=s1.subSequence(4,8);
		System.out.println(cs);
		s2=s1.substring(5);
		System.out.println(s2);
		s3=s1.substring(5,8);
		System.out.println(s3);
		c="Alexandria".toCharArray();
		for(int i=0;i<c.length;i++)
			System.out.println(c[i]);
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toString());
		System.out.println(" Alexandria ".trim());
	}
}
		

	