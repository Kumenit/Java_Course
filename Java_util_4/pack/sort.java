package pack;
import java.util.*;
public class sort{
	public static void disp(int a[])
	{
		for(int i=0;i<a.length;i++)
			System.out.println(a[i]+"\t");
		System.out.println();
	}
	public static void displ(String s[])
	{
		for(int i=0;i<s.length;i++)
			System.out.println(s[i]+"\t");
		System.out.println();
	}
	public static void main(String[] args)
	{
		int a[]={10,8,7,4,5,9,2,3,5};
		disp(a);
		Arrays.sort(a);
		disp(a);
	Arrays.sort(a,0,5);
	disp(a);
		String s[]={"this","is","best","you"};
		displ(s);
		Arrays.sort(s);
		displ(s);
	}
}
		