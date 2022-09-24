package pack;
import java.util.*;
public class synchronizedl{
	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<String>();
		al.add("me");
		al.add("you");
		List<String> l=Collections.synchronizedList(al);
		thread t=new thread(l);
		thread1 t1=new thread1(l);
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