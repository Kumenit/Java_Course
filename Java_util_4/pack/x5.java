package pack;
import java.util.*;
public class x5{
	public static void main(String[] args)
	{
	double d[]={3.11,2.11,7.2,3.44};
	Arrays.sort(d);
	System.out.println("indexOf:"+Arrays.binarySearch(d,3.11));
	System.out.println("indexOf 3.11 in range:"+Arrays.binarySearch(d,2,4,3.11));
	System.out.println("inseration point:"+Arrays.binarySearch(d,4.2));
	}
}

