package pack;
import java.util.*;
public class equals{
	public static void main(String[] args)
	{
		int a[]={1,2,3,4,5,6,7,8,9,10};
		int b[]={1,2,3,4,5,6,7,8,9,10};
		int c[]={109,8,7,6,5,4,3,2,1};
	    System.out.println("is a and b equals:"+Arrays.equals(a,b));
		System.out.println("is a and c equals:"+Arrays.equals(a,c));
		String s[]={"i","love","you"};
		String s1[]={"you","love","me"};
		String s2[]={"i","love","you"};
		System.out.println("is s and s1 equals:"+Arrays.equals(s,s1));
		System.out.println("is s and s2 equals:"+Arrays.equals(s,s2));
	}
}
	