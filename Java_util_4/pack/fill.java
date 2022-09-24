package pack;
import java.util.*;
public class fill{
	public static void disp(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}
	}
	public static void displ(String s[])
	{
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]+"\t");
		}
	}
	public static void main(String[] args)
	{
		int a[]={1,2,3,4,5,6,7,8,9,10};
		System.out.println("the value of a is:");
		disp(a);
		Arrays.fill(a,1);
		System.out.println("after using fill");
		disp(a);
		int b[]={10,9,8,7,6,5,4,3,2,1};
		System.out.println("the value of b is:");
		disp(b);
		Arrays.fill(b,2,5,4);
		System.out.println("after using fill from 2 to 5:");
		disp(b);
	}
}