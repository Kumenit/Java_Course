package pack;
import java.util.*;
public class aslifoqueue{
	public static void main(String[] args)
	{
		ArrayDeque<String> ad=new ArrayDeque<String>();
		ad.add("me");
		ad.add("that");
		ad.add("you");
		ad.add("kome");
		System.out.println("the value of ad:"+ad);
		ad.remove();
		System.out.println("the new  value:"+ad);
		Queue<String> q=Collections.asLifoQueue(ad);
		q.remove();
		System.out.println("after:"+q);
		q.add("sofe");
		q.add("desta");
		System.out.println("now ad is:"+q);
		q.remove();
		System.out.println("now q is:"+q);
	}
}