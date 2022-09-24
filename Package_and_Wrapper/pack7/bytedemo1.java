package pack7;
public class bytedemo1{
	public static void main(String[] args)
	{
	Byte b; boolean a;
	int i;
	byte bt;
	b=Byte.valueOf((byte)400);
	System.out.println("byte valueof(400):"+b);
	b=Byte.valueOf("20");
	System.out.println("byte octal value of 20:"+b);
	b=Byte.valueOf("20",8);
	System.out.println("byte valueof \"20\":"+b);
	bt=Byte.parseByte("20");
	System.out.println("byte parseByte \"20\":"+bt);
	bt=Byte.parseByte("20",8);
	System.out.println("byte parseByte \"20\":"+bt);
	Byte b1=new Byte("80");
	Byte b2=new Byte("60");
	Byte b3=new Byte("80");
	b1.byteValue();
	System.out.println("byte value of b1:"+b1);
	b2.byteValue();
	System.out.println("byte value of b2:"+b2);
	b=Byte.decode("020");
	System.out.println("octal value of 20 is:"+b);
	b=Byte.decode("0x20");
	System.out.println("hexadicimal value of 20 is:"+b);
	a=b1.equals(b2);
	System.out.println("b1 equals b2:"+a);
	a=b1.equals(b3);
	System.out.println("b2 equals b3:"+a);
	i=b1.compareTo(b2);
	System.out.println("b1 compareto b2:"+i);
	i=b2.compareTo(b1);
	System.out.println("b2 compareTo b1:"+i);
}
}