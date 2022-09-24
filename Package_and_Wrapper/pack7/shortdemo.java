package pack7;
public class shortdemo{
	public static void main(String[] args)
	{
	Short b; boolean a;
	int i;
	String s;
	short bt;
	s=Short.toString((short)240);
	System.out.println("the string value of 30:"+s);
	b=Short.valueOf((short)1300);
	System.out.println("byte valueof(300):"+b);
	b=Short.valueOf("40");
	System.out.println("byte octal value of 20:"+b);
	b=Short.valueOf("40",8);
	System.out.println("byte valueof \"20\":"+b);
	bt=Short.parseShort("40");
	System.out.println("byte parseByte \"20\":"+bt);
	bt=Short.parseShort("40",8);
	System.out.println("byte parseByte \"20\":"+bt);
	Short s1=new Short("120");
	Short s2=new Short((short)240);
	Short s3=new Short("120");
    s1.shortValue();
	System.out.println("byte value of b1:"+s1);
	s2.shortValue();
	System.out.println("byte value of b2:"+s2);
	b=Short.decode("020");
	System.out.println("octal value of 20 is:"+b);
	b=Short.decode("0x20");
	System.out.println("hexadicimal value of 20 is:"+b);
	a=s1.equals(s2);
	System.out.println("b1 equals b2:"+a);
	a=s1.equals(s3);
	System.out.println("b2 equals b3:"+a);
	i=s1.compareTo(s2);
	System.out.println("b1 compareto b2:"+i);
	i=s2.compareTo(s1);
	System.out.println("b2 compareTo b1:"+i);
	System.out.println("reversbyte:"+Short.reverseBytes(s1));
    System.out.println("reversbyte:"+Short.reverseBytes(s2));
}
}