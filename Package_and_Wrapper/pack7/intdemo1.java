package pack7;
public class intdemo1{
	public static void main(String[] args)
	{
	Integer b; boolean a;
	int i;
	String s;
	int bt;
	s=Integer.toString((int)240);
	System.out.println("the string value of 30:"+s);
	b=Integer.valueOf(1300);
	System.out.println("byte valueof(1300):"+b);
	b=Integer.valueOf("120");
	System.out.println("byte octal value of 20:"+b);
	b=Integer.valueOf("120",8);
	System.out.println("byte valueof \"20\":"+b);
	bt=Integer.parseInt("120");
	System.out.println("byte parseByte \"20\":"+bt);
	bt=Integer.parseInt("120",8);
	System.out.println("byte parseByte \"20\":"+bt);
	Integer t1=new Integer("1200");
	Integer t2=new Integer(240);
	Integer t3=new Integer(1200);
    t1.intValue();
	System.out.println("byte value of b1:"+t1);
	t2.intValue();
	System.out.println("byte value of b2:"+t2);
	b=Integer.decode("020");
	System.out.println("octal value of 20 is:"+b);
	b=Integer.decode("0x20");
	System.out.println("hexadicimal value of 20 is:"+b);
	a=t1.equals(t2);
	System.out.println("b1 equals b2:"+a);
	a=t1.equals(t3);
	System.out.println("b2 equals b3:"+a);
	i=t1.compareTo(t2);
	System.out.println("b1 compareto b2:"+i);
	i=t2.compareTo(t1);
	System.out.println("b2 compareTo b1:"+i);
	System.out.println("reversbyte:"+Integer.reverseBytes(40));
    System.out.println("reversbyte:"+Integer.reverseBytes(t2));
}
}