package pack;
public class reading{
	public static void main(String[] args)
	{
		String s="kumenit";
		System.out.println("CharAt:"+s.charAt(3));
		System.out.println("codePointAt:"+s.codePointAt(3));
		System.out.println("codePointBefore:"+s.codePointBefore(3));
		System.out.println("codePointCount:"+s.codePointCount(2,6));
		byte b[]=s.getBytes();
		for(int i=0;i<b.length;i++)
		System.out.println(b[i]+"\t");
	    System.out.println();
		char c[]=new char[3];
		s.getChars(2,5,c,0);
		for(int k=0;k<c.length;k++)
			System.out.println(c[k]+"\t");
		System.out.println();
	}
}
		