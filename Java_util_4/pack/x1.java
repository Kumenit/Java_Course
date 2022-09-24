package pack;
import java.util.*;
public class x1{
	public static void main(String[] args)
	{
		Random r=new Random();
		byte b[]=new byte[10];
		r.nextBytes(b);
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]+"\t");
		}
	}
}