package qpack;
public class x2{
	public static void main(String[] args)
	{
		String s="Alexandria";
		StringBuffer sb1;
		byte b[];
		char c[];
		System.out.println(s.endsWith("dria"));
		System.out.println(s.endsWith("a"));
		System.out.println(s.endsWith("dia"));
		System.out.println(s.equals("Alexandria"));
		System.out.println(s.equals("Egypt"));
		sb1=new StringBuffer("Alexandria");
		System.out.println(s.equals(sb1));
		System.out.println(s.equals("ALEXANDRIA"));
		System.out.println(s.equalsIgnoreCase("ALEXANDRIA"));
		b=s.getBytes();
		for(int i:b)
			System.out.println(i+"\t");
		System.out.println("\n");
		c=new char[4];
		s.getChars(3,7,c,0);
		for(int j=0;j<c.length;j++)
			System.out.println(c[j]+"\t");
		System.out.println();
		System.out.println(s.getClass());
		System.out.println(s.indexOf('d'));
		System.out.println(s.indexOf('A'));
		System.out.println(s.indexOf('g'));
		System.out.println(s.indexOf("dria"));
		System.out.println(s.indexOf("aia"));
		System.out.println(s.indexOf('a',2));
	}
}
		
		