package pack;
import java.util.*;
public class mix{
	public static void main(String[] args)
	{
		Integer a[]={10,9,8,7,6,5,4,3,2,1};
		Integer b[]={1,2,3,4,5,6,7,8,9,10};
		Integer c[]=Arrays.copyOf(a,10);
		System.out.println("hashcode:"+Arrays.hashCode(a));
		System.out.println("deepHashcode:"+Arrays.deepHashCode(a));
		System.out.println("deepEquals:"+Arrays.deepEquals(a,b));
		System.out.println("toString:"+Arrays.toString(a));
		System.out.println("deepToString:"+Arrays.deepToString(c));
	}
}
		