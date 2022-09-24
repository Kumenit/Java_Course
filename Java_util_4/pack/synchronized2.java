package pack;
import java.util.*;
public class synchronized2{
	public static void main(String[] args)
	{
		HashMap<String,Integer> al=new HashMap<String,Integer>();
		al.put("me",6);
		al.put("you",7);
		Map<String,Integer> l=Collections.synchronizedMap(al);
		thread3 t=new thread3(l);
		thread2 t1=new thread2(l);
		t.start();
		t1.start();
		try{
			t.join();
			t1.join();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}