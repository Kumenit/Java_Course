package pack;
public class string15{
	public static void main(String[] args)
	{
		int i=10;
		double d=45.3;
		char c='a';
		String s=String.valueOf(i);
		System.out.println("valueOfi:"+s);
		s=String.valueOf(d);
		System.out.println("value of d:"+s);
		s=String.valueOf(c);
		System.out.println("value of c:"+s);
		char cr[]={'a','b','c','d','e','f','h','i'};
		s=String.copyValueOf(cr);
		System.out.println("copyValueOf:"+s);
	     s=String.copyValueOf(cr,2,5);
		 System.out.println("copyValueOf 2:"+s);
	}
}