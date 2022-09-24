package pack;
import java.util.*;
public class copyOf{
	public static void disp(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+"\t");
		}
	}
	public static void main(String[] args)
	{
		int a[]={1,2,3,4,5,6,7,8,9,0};
		int b[],c[];
		System.out.println("the value of b after copy:");
		b=Arrays.copyOf(a,9);
		disp(b);
		System.out.println("the value of c after using to many number");
		c=Arrays.copyOf(a,20);
		disp(c);
	}
}