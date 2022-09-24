package pack;
public class stringbuffer4{
	public static void main(String[] args)
	{
		StringBuffer s=new StringBuffer("abcdef");
		CharSequence cr=s.subSequence(1,4);
			System.out.println("subSequence:"+cr);
			System.out.println("subString:"+s.substring(3));
			System.out.println("subString:"+s.substring(2,4));
			System.out.println("toString:"+s.toString());
			System.out.println("capacity:"+s.capacity());
			s.trimToSize();
			System.out.println("trim:"+s.capacity());
			System.out.println("getClass:"+s.getClass());
			System.out.println("hashCode:"+s.hashCode());
	}
}