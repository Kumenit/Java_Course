package pack7;
public class longdemo{
	public static void main(String[] args)
	{
	Long l1=new Long(60000000);
	l1.intValue();
	System.out.println("t1="+l1);
	System.out.println("to string with coma:"+Long.toString(40000,8));
	System.out.println("to hexString:"+Long.toHexString(10000));
	System.out.println("to octalString:"+Long.toOctalString(30000));
	System.out.println("to binaryString:"+Long.toBinaryString(12000));
	System.out.println("highest onebit:"+Long.highestOneBit(13600));
	System.out.println("lowest onebit:"+Long.lowestOneBit(20200));
	System.out.println("numberOfLeadingZeros:"+Long.numberOfLeadingZeros(20400));
	System.out.println("numberOfTrailingZeros:"+Long.numberOfTrailingZeros(60040));
	System.out.println("bitCount:"+Long.bitCount(8080));
	System.out.println("rotateLeft:"+Long.rotateLeft(90904,2));
	System.out.println("rotateRight:"+Long.rotateRight(90000,2));
	System.out.println("reverse:"+Long.reverse(1034));
	System.out.println("signum:"+Long.signum(-10333));
}
}	