package pack7;
public class intdemo{
	public static void main(String[] args)
	{
	Integer t1=new Integer(60);
	t1.intValue();
	System.out.println("t1="+t1);
	System.out.println("to string with coma:"+Integer.toString(40,8));
	System.out.println("to hexString:"+Integer.toHexString(10));
	System.out.println("to octalString:"+Integer.toOctalString(30));
	System.out.println("to binaryString:"+Integer.toBinaryString(10));
	System.out.println("highest onebit:"+Integer.highestOneBit(10));
	System.out.println("lowest onebit:"+Integer.lowestOneBit(10));
	System.out.println("numberOfLeadingZeros:"+Integer.numberOfLeadingZeros(20));
	System.out.println("numberOfTrailingZeros:"+Integer.numberOfTrailingZeros(20));
	System.out.println("bitCount:"+Integer.bitCount(8));
	System.out.println("rotateLeft:"+Integer.rotateLeft(9,2));
	System.out.println("rotateRight:"+Integer.rotateRight(9,2));
	System.out.println("reverse:"+Integer.reverse(10));
	System.out.println("signum:"+Integer.signum(-10));
}
}	