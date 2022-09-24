package pack;
import java.util.*;
public class random{
	public static void main(String[] args)
	{
		Random r=new Random();
		System.out.println("nextInt:"+r.nextInt());
		System.out.println("nextBoolean:"+r.nextBoolean());
		System.out.println("nextFloat:"+r.nextFloat());
		System.out.println("nextDouble:"+r.nextDouble());
		System.out.println("nextint in 4:"+r.nextInt(4));
		System.out.println("nextGessian:"+r.nextGaussian());
		Random r1=new Random(300102);
		System.out.println("nextInt for r1:"+r1.nextInt());
		byte b[]=new byte[10];
		r.nextBytes(b);
		for(int i=0;i<b.length;i++)
			System.out.println(b[i]+"\t");
	}
}
	