package pack7;
public class x10{
	public static void main(String[] args)
	{
	Integer t1=new Integer(60);
	t1.intValue();
	System.out.println("t1="+t1);
	System.out.println("to string with coma:"+Integer.toString(150,16));
	System.out.println("to hexString:"+Integer.toHexString(100));
	System.out.println("to octalString:"+Integer.toOctalString(100));
	System.out.println("to binaryString:"+Integer.toBinaryString(100));
	System.out.println("highest onebit:"+Integer.highestOneBit(150));
	System.out.println("lowest onebit:"+Integer.lowestOneBit(150));
	System.out.println("numberOfLeadingZeros:"+Integer.numberOfLeadingZeros(150));
	System.out.println("numberOfTrailingZeros:"+Integer.numberOfTrailingZeros(150));
	System.out.println("bitCount:"+Integer.bitCount(150));
	System.out.println("rotateLeft:"+Integer.rotateLeft(150,4));
	System.out.println("rotateRight:"+Integer.rotateRight(150,1));
	System.out.println("reverse:"+Integer.reverse(150));
	System.out.println("signum:"+Integer.signum(-10));
}
}	