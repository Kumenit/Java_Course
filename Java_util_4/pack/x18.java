package pack;
import java.util.*;
public class x18{
	public static void main(String[] args)
	{
		HashSet<String> al=new HashSet<String>();
		al.add("kome");
		al.add("sofe");
		Set<String> s=Collections.synchronizedSet(al);
		set s1=new set(s);
		try{
		Thread.sleep(1000);
		}catch(InterruptedException e)
		{}
		s1.start();
		try{
			s1.join();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}