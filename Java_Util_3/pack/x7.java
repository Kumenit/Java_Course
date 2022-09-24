package pack;
import java.util.*;
public class x7{
public static void main(String[] arg) {
	BitSet b=new BitSet(5);
	b.set(0,3);
	System.out.println(b);
	b.flip(4);
	System.out.println(b);
	b.clear(1);
	System.out.println(b);
	b.set(3,true);
	System.out.println(b);
	System.out.println(b.get(2));
	System.out.println(b.nextSetBit(2)+" "+b.nextClearBit(2));
	System.out.println(b.length()+" "+b.cardinality());
}
}


	