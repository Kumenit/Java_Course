package pack;
import java.util.*;
public class thread2 extends Thread{
	Map<String,Integer> l;
	public thread2(Map<String,Integer> l)
	{
		this.l=l;
	}
	public void run()
	{
		disp(l);
	}
	public void disp(Map<String,Integer> l)
	{
		Set<String> s=l.keySet();
		synchronized(l){
			Iterator<String> i=s.iterator();
			while(i.hasNext())
				System.out.println(i.next()+"\t");
		}
	}
}