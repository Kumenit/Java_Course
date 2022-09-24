package pack;
import java.util.*;
public class bitset{
	public static void main(String[] args)
	{
		BitSet b=new BitSet(10);
		b.set(0,10);
		System.out.println("the value of bitset:"+b);
		b.set(0,5,false);
		System.out.println("after 0 up to 5 false used"+b);
 		b.set(3,true);
		System.out.println("after 3 true used:"+b);
		b.set(1);
		System.out.println("after 1 true:"+b);
		b.flip(0,5);
		System.out.println("after fliping 0 up to 5:"+b);
		b.flip(6);
		System.out.println("after fliping 6:"+b);
		System.out.println("using get"+b.get(3));
		System.out.println("using get for mor than one:"+b.get(2,6));
		System.out.println("nextSetBit:"+b.nextSetBit(5));
		System.out.println("nextClearBit:"+b.nextClearBit(0));
		b.clear(2);
		System.out.println("after clearing 2:"+b);
		b.clear(4,7);
		System.out.println("after clearing 4 up to 7:"+b);
		System.out.println("the length is:"+b.length());
		System.out.println("the size is:"+b.size());
		System.out.println("the cardinality:"+b.cardinality());
		b.clear();
		System.out.println("after using clear:"+b);
	}
}