package pack;
import java.util.*;
public class bitset2{
	public static void main(String[] args)
	{
		BitSet b=new BitSet(10);
		b.set(0,5);
		System.out.println("the value of b is:"+b);
		BitSet b1=new BitSet(10);
		b1.set(4,10);
		System.out.println("the value of b1 is:"+b1);
		b.and(b1);
		System.out.println("the value of b1 is:"+b);
	b.or(b1);
		System.out.println("intersects:"+b.intersects(b1));
		System.out.println("the value of b1 is:"+b);
		b.xor(b1);
		System.out.println("the value of b1 is:"+b);
		b.andNot(b1);
		System.out.println("the value of b1 is:"+b);
	
	}
}
		